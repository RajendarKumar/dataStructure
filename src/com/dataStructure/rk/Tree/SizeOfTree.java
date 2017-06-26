package com.dataStructure.rk.Tree;

public class SizeOfTree {

	public static void main(String[] args) {

		Node root = new Node(new Node(new Node(null, 4, null), 2, null),  1, new Node(null, 3, null));
		System.out.println(sizeOfTree(root));
	}
	
	private static int sizeOfTree(Node root){
		if(null == root){
			return 0;
		}
		return sizeOfTree(root.left)+1+sizeOfTree(root.right);
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
