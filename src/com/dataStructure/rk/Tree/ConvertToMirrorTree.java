package com.dataStructure.rk.Tree;

public class ConvertToMirrorTree {

	public static void main(String[] args) {

		Node root = new Node(new Node( new Node( null, 4, null), 2, new Node( null, 5, null)),  1, new Node(new Node( null, 6, null), 3, null));
		miror(root);
	}
	
	private static void miror(Node root){
		if(null == root){
			return;
		}
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		miror(root.left);
		miror(root.right);
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
