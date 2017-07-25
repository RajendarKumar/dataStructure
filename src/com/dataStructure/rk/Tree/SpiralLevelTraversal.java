package com.dataStructure.rk.Tree;

public class SpiralLevelTraversal {

	public static void main(String[] args) {

		Node root = new Node(new Node(new Node(new Node(null, 8, null), 4, null), 2, new Node(null, 5, null)), 1, new Node(new Node(null, 6, null), 3,  new Node(null, 7, new Node(null, 15, null))));
		spiralLevelTraversal(root);
	}

	public static void spiralLevelTraversal(Node node){
		int height = height(node);
		boolean goTo = true;
		for (int i = 1; i <= height; i++) {
			printSpiralLevelTraversal(node,goTo, i);
			goTo =!goTo;
		}
	}
	private static int height(Node node) {
		if(null == node)
			return 0;
		int lheight = height(node.left);
		int rheight = height(node.right);
		if (lheight > rheight) {
			return lheight + 1;
		}else{
			return rheight + 1;
		}
	}

	public static void printSpiralLevelTraversal(Node node,boolean goTo, int level){
		if(node==null){
			return;
		}
		if(level == 1){
			System.out.print(node.data+" ");
		}
		if(goTo){
			printSpiralLevelTraversal(node.left, goTo, level - 1);
			printSpiralLevelTraversal(node.right, goTo, level - 1);
		}else{
			printSpiralLevelTraversal(node.right, goTo, level - 1);
			printSpiralLevelTraversal(node.left, goTo, level - 1);
		}
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
