package com.esp.interviews.trees;

import java.util.Stack;

public class TreeSpiralTraversal {

	public static class Node {
		Node right, left, rtn;
		Integer data;

		public Node(int data) {
			right = left = rtn = null;
			this.data = data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.right = new Node(90);
		root.right.left = new Node(99);

		printSpiral(root);

	}

	private static void printSpiral(Node root) {
		// TODO Auto-generated method stub

		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		
		s1.push(root);
		
		while(!s1.isEmpty() || !s2.isEmpty()) {
			
			while(!s1.isEmpty()) {
				Node temp = s1.pop();
				System.out.println(temp.data);
				
				if(temp.right!=null)
					s2.push(temp.right);
				if(temp.left!=null)
					s2.push(temp.left);
			}
			
			while(!s2.isEmpty()) {
				Node temp = s2.pop();
				System.out.println(temp.data);
				
				if(temp.left!=null)
					s1.push(temp.left);
				if(temp.right!=null)
					s1.push(temp.right);
				
			}
			
		}
	}

}
