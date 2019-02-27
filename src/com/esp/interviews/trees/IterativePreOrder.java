package com.esp.interviews.trees;

import java.util.Stack;

public class IterativePreOrder {

	public static class Node {
		Node right, left;
		Integer data;

		public Node(int data) {
			right = left = null;
			this.data = data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root= new Node(10); 
		root.left = new Node(8); 
		root.right = new Node(2); 
		root.left.left = new Node(3); 
		root.left.right = new Node(5); 
		root.right.left = new Node(99); 
		root.right.right = new Node(90);
		
		printPreOrder(root);

	}

	private static void printPreOrder(Node root) {
		// TODO Auto-generated method stub
		Stack<Node> s = new Stack<>();
		s.push(root);
		
		while(s.size()>0) {
			Node temp = s.pop();
			System.out.println(temp.data);
			
			if(temp.right!=null)
				s.push(temp.right);
			
			if(temp.left!=null)
				s.push(temp.left);
		}
		
	}

}
