package com.dataStructure.rk.Tree;

public class LowestCommonAncestorRecursion {

	public static void main(String[] args) {
		Node root = lca(new Node(new Node(null, 1 , null), 2,  new Node(null,3, null)), new  Node(null, 1 , null),new Node(null, 3 , null) );
		System.out.println(root.data);
	}
	
	/**
	 * <p>This method return the  lowest common ancestor<p>
	 * @param root
	 * @param a
	 * @param b
	 * @return return the lowest common ancestor
	 */
	public static Node lca(Node root, Node a, Node b) {
		if(null == root || root.data == a.data || root.data == b.data) {
			return root;
		}
		Node left = lca(root.left, a, b);
		Node right = lca(root.right, a, b);
		
		if(left != null && right != null) return root;
		
		if(left == null) return right; else return left;
	}
	
	static class Node{
		int data;
		Node left;
		Node right;
		Node(Node left, int data, Node right){
			this.left = left;
			this.data = data;
			this.right = right;
		}
	}
}
