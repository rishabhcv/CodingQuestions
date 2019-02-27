package com.esp.interviews.trees;

import java.util.Stack;

public class IterativeInOrder {

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
		
		printInOrder(root);

	}

	private static void printInOrder(Node root) {
		// TODO Auto-generated method stub
		Node curr = root;
		Stack<Node> s = new Stack<>();
		
		while(s.size()>0 || curr!=null) {
			
			while(curr!=null) {
				s.push(curr);
				curr = curr.left;
			}
			
			curr = s.pop();
			System.out.println(curr.data); 
			curr = curr.right;
		}
		
	}

}
