package com.dataStructure.rk.Tree;

import java.util.Stack;

public class InorderItrativeTraversal {

	public static void main(String[] args) {
		Node root = new Node(new Node(new Node(new Node(null, 5, null), 4, new Node(null, 7, null)), 2, new Node(null, 8, null)),  1, new Node(new Node(null, 9, null), 3, new Node(null, 6, null)));
		print(root);
	}

	static void print(Node node){
		Stack<Node> stack = new Stack<>();
		Node current = node;
		do{
			while(null != current){
					stack.push(current);
					current = current.left;
			}
			while(null == current && !stack.isEmpty()){
				Node data = stack.pop();
				System.out.print(data.data+" ");
				current = data.right;
			}

		}while(current != null || !stack.isEmpty());
	}

	static class Node {

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
