package com.dataStructure.rk.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeafNodes {

	public static void main(String[] args) {
		Node root = new Node(new Node(new Node(new Node(null, 5, null), 4, new Node(null, 7, null)), 2, null),  1, new Node(null, 3, new Node(null, 6, null)));
		Queue<Node> leafs = new LinkedList<>();
		leafNodes(root, leafs);
		while (!leafs.isEmpty()) {
			System.out.print(leafs.poll().data+" ");
		}
	}
	
	/**
	 * <p>Method will update the {@link Queue} with leaf nodes.<p>
	 * @param root
	 * @param leafs
	 */
	public static void leafNodes(Node root, Queue<Node> leafs) {
		if(null == root) return;
		if(null == root.left && null == root.right) leafs.add(root);
		leafNodes(root.left, leafs);
		leafNodes(root.right, leafs);
	}
	static class Node {//Node will represent the node of a tree

		int data;
		Node left;
		Node right;

		public Node(Node left, int data, Node right) {
			this.left = left;
			this.right = right;
			this.data = data;
		}

	}
}
