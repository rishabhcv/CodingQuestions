package com.esp.interviews.trees;

import java.util.Stack;

public class IterativePostOrder {

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
		root.right.right = new Node(90);
		root.right.left = new Node(99); 
		
		printPostOrder(root);

	}

	private static void printPostOrder(Node root) {
		
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		s1.push(root);
		
		while(!s1.isEmpty()) {
		
			Node temp = s1.pop();
			s2.push(temp);
			
			if(temp.left!=null)
				s1.push(temp.left);
			
			if(temp.right!=null)
				s1.push(temp.right);
		}
		
		while(!s2.isEmpty()) {
			System.out.println(s2.pop().data);
		}
		
	}

}
