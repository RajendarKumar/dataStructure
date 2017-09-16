/**
 * 
 */
package com.dataStructure.rk.Tree;

/**
 * Morris in-order traversal
 * 
 * 	1. Initialize current as root 
 *	2. While current is not NULL
 *  	If current does not have left child
 *     		a) Print current’s data
 *    		b) Go to the right, i.e., current = current->right
 *		Else
 *		    a) Make current as right child of the rightmost 
 *		        node in current's left subtree
 *     		b) Go to this left child, i.e., current = current->left
 * 
 * 
 * @author Rajendar Kumar
 *
 *
 */
public class InorderTraversalZeroExtraSpace {

	public static void main(String[] args) {
		Node root = new Node(new Node(null, 2, null), 1, new Node(null, 3, null));
		inorderTranversal(root );
	}

	public static void inorderTranversal(Node root){
		
		Node current =root;
		while(null != current){
			if(null == current.left){
				System.out.println(current.data);
				current = current.right;
			}else{
				Node pre = rightMost(current);
				if(pre.right==null) {
					pre.right= current;
					current = current.left;
				}else {
					pre.right = null;
					System.out.println(current.data);
					current = current.right;
				}
			}
		}
	}
	
	static Node rightMost(Node node){
		Node rightNode = node.left;
		while(rightNode.right != null && rightNode.right != node){
			rightNode = rightNode.right; 
		}
		return rightNode;
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
