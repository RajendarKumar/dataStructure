/**
 * 
 */
package com.dataStructure.rk.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rajendar Kumar
 *
 */
public class RootToLeafPath {


	public static void main(String[] args) {
		List<Integer> data = new ArrayList<>();
		Node root = new Node(new Node( new Node( null, 4, null), 2, new Node( null, 5, null)),  1, new Node(new Node( null, 6, null), 3, null));
		printRootToLeafPath(root, data,0);
	}
	
	private static void printRootToLeafPath(Node root, List<Integer> data, int i){
		if(null == root){
			return;
		}
		data.add(i,root.data);
		i++;
		if(null == root.left && null == root.right){
			print(data,i);
			return;
		}
		printRootToLeafPath(root.left, data, i);
		printRootToLeafPath(root.right, data, i);
	}

	private static void print(List<Integer> data, int i) {
		for (int j = 0 ; j < i; j++) {
			System.out.print(data.get(j)+"	");
		}
		System.out.println();
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
