package com.dataStructure.rk.list;

public class DoublyLinkedList {

	public static void main(String[] args) {
		
		Node l = new Node(null, 1, null);
		Node r =new Node(null, 2, null);
		l.right=r;
		l.left = r;
				
		r.left=l;
		r.right=l;
		System.out.println(r);
	}
	static class Node{
		Node left;
		int data;
		Node right;
		
		public Node(Node left, int data, Node right) {
			super();
			this.left = left;
			this.right = right;
			this.data = data;
		}
		
	}
}
