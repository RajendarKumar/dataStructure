package com.dataStructure.rk.list;

public class NthFromLast {

	public static void main(String[] args) {

		Node current = new Node(1,null);
		current.next = new Node(2,null);
		current.next.next = new Node(3,null);
		current.next.next.next = new Node(4,null);
		
		Node nthFromLast = getNthFromLast(current, 4);
		
		System.out.println(nthFromLast != null ? nthFromLast.data:-1);
	}
	/**
	 * <p>Accepts linked list and a number.<p>
	 * <ol>
	 * <li> nodes : is a linked list head.</li>
	 * <li> n : nth node from last.</li>
	 * </ol> 
	 * @param nodes
	 * @param n
	 * @return nth Node from last
	 */
	public static Node getNthFromLast(Node nodes, int n) {
		Node nth = null;
		Node nxt = nodes;
		int cnt=0;
		while(null != nxt) {
			if(++cnt == n) {
				nth = nodes;
			}else if(null != nth) {
				nth = nth.next;
			}
			nxt = nxt.next;
		}
		return nth;
	}

	static class Node{
		public int data;
		public Node next;
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
		
}
