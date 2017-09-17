package com.dataStructure.rk.list;

/**
 * This class is used to print and reverse a linked list.
 * @author Rajendar Kumar
 *
 */
public class ReverseLinkedList {

	public static void main(String[] args) {
		Node current = new Node(1);
		current.next = new Node(2);
		current.next.next = new Node(3);
		current.next.next.next = new Node(4);
		printLinkedList(current);
		Node node = reverse(current);
		printLinkedList(node);
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
	/**
	 * 
	 * @param current
	 * @return node The head of new reversed linked list.<p>
	 */
	public static Node reverse(Node current) {
		Node pre = null;
		Node next = null;
		while(null != current) {
			next = current.next;
			current.next = pre;
			pre = current;
			current = next;
		}
		return pre;
		
	}
	/**
	 * <p>This is the class to represent the linked list node.<p>
	 * @author Rajendar Kumar
	 *
	 */
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
}
