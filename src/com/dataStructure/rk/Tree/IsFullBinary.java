package com.dataStructure.rk.Tree;

public class IsFullBinary {

	public static void main(String[] args) {
		//Node node = new Node(new Node(new Node(new Node(null, 5, null), 4, null), 2, null),  1, new Node(null, 3, new Node(null, 6, null)));

		Node node = new Node(new Node(new Node(null, 4, null), 2, new Node(null, 5, null)),  1, new Node(new Node(null, 6, null), 3, new Node(null, 7, new Node(null, 8, null))));
		
		System.out.println(isBinary(node));
	}

	/**
	 * <p>Check binary tree is full binary tree or not.<p>
	 * @param node
	 * @return {@link Boolean}
	 */
	public static boolean isBinary(Node node) {
		
		if( null == node ) {
			return true;
		}
		
		if((null == node.left && null != node.right) || (null != node.left && null == node.right)) {
			return false;
		}
		
		if(isBinary(node.left) && isBinary(node.right)) {
			return true;
		}
		
		return false;
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
