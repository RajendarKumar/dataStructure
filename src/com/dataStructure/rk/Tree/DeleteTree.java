package com.dataStructure.rk.Tree;

public class DeleteTree {

	public static void main(String[] args) {

		Node root = new Node(new Node(new Node(new Node(null, 5, null), 4, null), 2, null),  1, new Node(null, 3, new Node(null, 6, null)));
		System.out.println(delete(root));
	}
	
	private static Node delete(Node root){
		if(null == root){
			return root;
		}
		delete(root.left);
		delete(root.right);
		return root=null;
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
