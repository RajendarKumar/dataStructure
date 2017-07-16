package com.dataStructure.rk.list;

public class ContactinateDoublyCircularLinkList {

	public static void main(String[] args) {

		Node lList = new Node(null,1,null);
		lList.left=lList.right=lList;
		Node rList = new Node(null,2,null);
		rList.left = rList.right=rList;
		concatincate(lList, rList);
		
	}
	/**
	 * <p>Accepts two circular doubly linked list.
	 * @param lCircularDoublyLinkedList
	 * @param rCircularDoublyLinkedList
	 * @return contactinatedDoublyCircularLinkList
	 */
	public static Node concatincate(Node lCircularDoublyLinkedList, Node rCircularDoublyLinkedList){
		if(null == lCircularDoublyLinkedList){
			return rCircularDoublyLinkedList;
		}
		if(null == rCircularDoublyLinkedList){
			return lCircularDoublyLinkedList;
		}
		Node lLast = lCircularDoublyLinkedList.left;
		Node rLast = rCircularDoublyLinkedList.left;
		lLast.right = rCircularDoublyLinkedList;
		rLast = lCircularDoublyLinkedList.left.right;
		rLast.right=lCircularDoublyLinkedList;
		lCircularDoublyLinkedList.left=rLast;
		
		return lCircularDoublyLinkedList;
	}
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(Node left, int data, Node right){
			this.left = left;
			this.right = right;
			this.data = data;
		}
	}
}
