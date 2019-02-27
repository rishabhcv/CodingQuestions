package com.esp.interviews.trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeRightView {

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
		
		printRight(root);

	}
	
	private static void printRight(Node root) {
		 Queue<Node> q = new LinkedList<Node>();  
	        q.add(root);
	        
	        while(!q.isEmpty()) {
	        	int qSize = q.size();
	        	
	        	
	        	for(int i=1;i<=qSize;i++) {
	        		Node temp = q.poll();
	        		if(i==qSize)
	        			System.out.println(temp.data);
	        		
	        		if(temp.left!=null)
	        			q.add(temp.left);
	        		if(temp.right!=null)
	        			q.add(temp.right);
	        	}
	        	
	        }
		
	}

}
