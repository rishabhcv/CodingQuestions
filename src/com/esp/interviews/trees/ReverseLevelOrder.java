package com.esp.interviews.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {
	public static class Node{
		Node right, left, rtn;
		Integer data;

		public Node(int data) {
			right=left=rtn=null;
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
		reverseLevelOrder(root);
	}

	private static void reverseLevelOrder(Node root) {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<>();
		Stack<Node> s = new Stack<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
			s.push(temp);
			
			if(temp.left!=null)
				q.add(temp.left);
			
			if(temp.right!=null)
				q.add(temp.right);
		}
		
		while(!s.isEmpty()) {
			System.out.println(s.pop().data);
		}
		
	}

}
