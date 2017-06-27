package com.dataStructure.rk.Tree;

public class HeightOfTree {

	public static void main(String[] args) {

		Node root = new Node(new Node(new Node(new Node(null, 5, null), 4, null), 2, null),  1, new Node(null, 3, new Node(null, 6, null)));
		System.out.println(heightOfTree(root));
	}
	
	private static int heightOfTree(Node root){
		if(null == root){
			return 0;
		}
		int left = heightOfTree(root.left)+1;
		int right = heightOfTree(root.right)+1;
		return left > right ? left : right;
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
