package com.dataStructure.rk.list;

public class ReverseLLByRec {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.next = new Node(2);
		root.next.next = new Node(3);
		root.next.next.next = new Node(4);
		root.next.next.next.next = new Node(5);
		Node nod = reverseLinkedList(root);
		printLinkedList(nod);
	}
	/**
	 * <p>Method will take the head of linked list and prints it's each node data.<p>
	 * @param head
	 */
	public static void printLinkedList(Node head) {
		Node dataNode = head;
		while(null != dataNode) {
			System.out.print(dataNode.data+" ");
			dataNode =dataNode.next;
		}
		System.out.println();
	}
	public static Node reverseLinkedList(Node node) {
		//This is the base case where control will return.
		if(null == node || null == node.next) {
			return node;
		}
		Node remaining = reverseLinkedList(node.next);
		//Reverse the two adjacent node.
		node.next.next = node;
		node.next = null;
		return remaining;
	}
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
}
