/**
 * 
 */
package com.dataStructure.rk.Tree;

/**
 * @author Rajendar Kumar
 *
 */
public class CountLeafNodes {

	public static void main(String[] args) {
		Node root = new Node(new Node(new Node(new Node(null, 5, null), 4, new Node(null, 7, null)), 2, null),  1, new Node(null, 3, new Node(null, 6, null)));
		System.out.println(countLeafNodes(root));
	}
	
	public static int countLeafNodes(Node root){
		if(null == root){
			return 0;
		}
		if(null ==root.left && null == root.right){
			return 1;
		}
		
		return countLeafNodes(root.left)+countLeafNodes(root.right);
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
