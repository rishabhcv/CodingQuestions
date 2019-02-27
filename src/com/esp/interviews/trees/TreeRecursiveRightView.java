package com.esp.interviews.trees;

public class TreeRecursiveRightView {
	
	static int maxLevel =0;

	public static class Node{
		Node right, left;
		Integer data;

		public Node(int data) {
			right=left=null;
			this.data = data;
		}
	}
	
	public static void main(String[] args) {
		Node root= new Node(10); 
		root.left = new Node(8); 
		root.right = new Node(2); 
		root.left.left = new Node(3); 
		root.left.right = new Node(5); 
		root.right.right = new Node(90);
		root.right.left = new Node(99); 
		
		printRight(root,1);

	}
	
	private static void printRight(Node root, int level) {
		if(root == null)
			return;
		
		if(maxLevel<level) {
			System.out.println(root.data);
			maxLevel = level;
		}
			
		printRight(root.right, level+1);
		printRight(root.left, level+1);
		
	}
	

}
