package com.dataStructure.rk.Tree;

public class LevelOrderTreeTraversal {

	public static void main(String[] args) {
		Node root = new Node(new Node( new Node( null, 4, null), 2, new Node( null, 5, null)),  1, new Node(new Node( null, 6, null), 3, null));
		printLevelOrder(root);
	}
	
	public static void printLevelOrder(Node node){
		
		int h = heightOfTree(node);
		for (int i = 1; i <= h; i++) {
			print(node, i);
		}
	}
	public static void print(Node node, int level){
		if(null == node) return;
		if(1 == level) System.out.print(node.data +" ");
		else{
			print(node.left, level-1);
			print(node.right, level-1);
			
		}
	}
	public static int heightOfTree(Node node){
		if(null == node){
			return 0;
		}
		int lheight = heightOfTree(node.left);
		int rheight = heightOfTree(node.right);
		if(lheight > rheight){
			return lheight+ 1;
		}else{
			return rheight + 1;
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
