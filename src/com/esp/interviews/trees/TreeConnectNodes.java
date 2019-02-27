package com.esp.interviews.trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeConnectNodes {

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
		connect(root);

		System.out.println("Following are populated rtn pointers in \n" + 
				"the tree (-1 is printed if there is no rtn)"); 
		System.out.println("rtn of "+ root.data +" is "+ 
				((root.rtn != null) ? root.rtn.data : -1)); 
		System.out.println("rtn of "+ root.left.data+" is "+ 
				((root.left.rtn != null) ? root.left.rtn.data : -1)); 
		System.out.println("rtn of "+ root.right.data+" is "+ 
				((root.right.rtn != null) ? root.right.rtn.data : -1)); 
		System.out.println("rtn of "+  root.left.left.data+" is "+ 
				((root.left.left.rtn != null) ? root.left.left.rtn.data : -1)); 
		System.out.println("rtn of "+  root.left.right.data+" is "+ 
				((root.left.right.rtn != null) ? root.left.right.rtn.data : -1)); 
		System.out.println("rtn of "+  root.right.left.data+" is "+ 
				((root.right.left.rtn != null) ? root.right.left.rtn.data : -1)); 
		System.out.println("rtn of "+  root.right.right.data+" is "+ 
				((root.right.right.rtn != null) ? root.right.right.rtn.data : -1)); 
	
	}

	
	//Keep adding null to the end of each level to mark the end of the level
	private static void connect(Node root) {
		Queue<Node> q = new LinkedList<Node>();

		if(root==null)
			return;

		q.add(root);
		q.add(null);
		
		//First iteration, queue is: 10, null
		//2nd iteration, queue is: null,8,2
		//3rd iteration, queue is: 8,2,null
		while(!q.isEmpty()) {
			Node temp = q.poll();
			
			//First iteration, queue is: null, temp = 10
			//2nd iteration, queue is: 8,2, temp = null
			//3rd iteration, queue is: 2,null,  temp = 8
			if(temp!=null) {
				
				//First iteration, queue is: null, right neighbour is set to null for root
				temp.rtn = q.peek();
				
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
				//First iteration, queue is: null,8,2
			} 

			//Meaning we have reached the end of the queue
			else if (temp==null && !q.isEmpty()) {
				q.add(null);
				//2nd iteration, queue is: 8,2,null
			}
		}

	}

}
