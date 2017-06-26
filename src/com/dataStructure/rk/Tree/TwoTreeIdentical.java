package com.dataStructure.rk.Tree;

public class TwoTreeIdentical {

	public static void main(String[] args) {
		Node root1 = new Node(null, 1, null);
		Node root2 = new Node(null, 1, null);
		System.out.println(isIdenticalTree(root1, root2));
		
		 root1 = new Node(null, 1, null);
		 root2 = new Node(null, 2, null);
		System.out.println(isIdenticalTree(root1, root2));

	}

	private static boolean isIdenticalTree(Node root1, Node root2){
		
		if(null == root1 && null == root2){
			return true;
		}
		if(root1.data == root2.data && isIdenticalTree(root1.left, root2.left) && isIdenticalTree(root1.right, root2.right)){
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
