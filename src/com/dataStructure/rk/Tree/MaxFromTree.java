package com.dataStructure.rk.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxFromTree {
	
	public static void main(String[] args) {
		int max = max(new Node(new Node(new Node(new Node(null, 8, null), 4, null), 2, new Node(null, 5, null)), 1, new Node(new Node(null, 6, null), 3,  new Node(null, 7, new Node(null, 15, null)))), Integer.MIN_VALUE);
		System.out.println(max);
		
		max = max(new Node(new Node(new Node(new Node(null, 8, null), 4, null), 2, new Node(null, 5, null)), 1, new Node(new Node(null, 6, null), 3,  new Node(null, 7, new Node(null, 15, null)))));
		System.out.println(max);
	}
	/**
	 * <p>Method will return the maximun value from binary tree using recursion.<p>
	 * @param root
	 * @param maxValue
	 * @return max The maximum of tree.
	 */
	public static int max(Node root, int maxValue){
	
		if(null != root) {
			if(maxValue < root.data) {
				maxValue = root.data;
			}
			int value = max(root.right, max(root.left, maxValue));
			if(maxValue < value) {
				maxValue = value;
			}
		}
		return maxValue;
	}
	
	/**
	 * <p>Method will return maximum of tree, using iterative process.<p>
	 * @param root
	 * @return max The maximum of tree.
	 */
	public static int max(Node root) {
		int max = Integer.MIN_VALUE;
		Queue<Node> treeNode = new LinkedList<>();
		if(null != root) 
		treeNode.add(root);
		while (!treeNode.isEmpty()) {
			Node temp = treeNode.poll();
			if(max < temp.data) {
				max = temp.data;
			}
			if(null != temp.left){
				treeNode.add(temp.left);
			}
			if(null != temp.right){
				treeNode.add(temp.right);
			}
		}
		return max;
				
	}
	
	static class Node{//This class represent the node of tree.
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
