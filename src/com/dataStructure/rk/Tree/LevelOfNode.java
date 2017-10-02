package com.dataStructure.rk.Tree;

public class LevelOfNode {

	
	public static void main(String[] args) {
		int level = findLeve(new Node(new Node(null, 1 , null), 2,  new Node(null,3, null)), 3, 0);
		System.out.println(level);
	}
	
	/**
	 * 
	 * @param root
	 * @param data
	 * @param level
	 * @return level of the node
	 */
	public static int findLeve(Node root, int data, int level){
		if(null == root) return 0;
		
		if(data == root.data) return level;
		
		int nodeLevel = findLeve(root.left, data, level+1);
		
		if (0 != nodeLevel) return nodeLevel;
		
		nodeLevel = findLeve(root.right, data, level+1);
		
		return nodeLevel;
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
