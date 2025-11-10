package com.demo.trees;

import org.w3c.dom.Node;

public class MyBinarySearchTree {
	Node root;
	
	class Node{
		int data;
		Node left;
		Node right;
	
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
		
	}

	public MyBinarySearchTree() {
		root=null;
	}
	
	public void insertNode(int key) {
		root=insertData(root,key);
	}

	private Node insertData(Node root, int key) {
		Node newNode=new Node(key);
		if(root==null) {
			root=newNode;
			return root;
		}else {
			if(key<root.data) {
				root.left=insertData(root.left,key);
			}
			else {
				root.right=insertData(root.right,key);
			}
			return root;
		}
	}
		
		public void inorder() {
			inOrderTraversal(root);
			System.out.println();
		}

		private void inOrderTraversal(Node root) {
			if(root!=null) {
				inOrderTraversal(root.left);
				System.out.print(root.data+",");
				inOrderTraversal(root.right);
			
		}
		}
			
			public void preorder() {
				preOrderTraversal(root);
				System.out.println();
			}

			private void preOrderTraversal(Node root) {
				if(root!=null) {
					System.out.print(root.data+",");
					preOrderTraversal(root.left);
					preOrderTraversal(root.right);
				
			}
			}
			
			public void postorder() {
				postOrderTraversal( root);
				System.out.println();	
	}

			private void postOrderTraversal(Node root) {
				if(root!=null) {
				postOrderTraversal(root.left);
				postOrderTraversal(root.right);
				System.out.print(root.data+",");	}		
			}
			
			public void deleteNode(int key) {
				root=deleteData(root,key);
			}

			private Node deleteData(Node root, int key) {
				if(root==null) {
					return root;
					
				}
				if(key<root.data) {
					root.left=deleteData(root.left,key);
				}
				else if(key>root.data) {
					root.right=deleteData(root.right,key);
				}
				else {
					if(root.left==null && root.right==null) {
						return null;
					}
					else if(root.left==null) {
						return root.right;
					}
					else if(root.right==null) {
						return root.left;
					}
					root.data=minvalue(root.right);
					root.right=deleteData(root.right,root.data);
				}
				return root;
			}

			private int minvalue(Node right) {
				int min=root.data;
				while(root.left!=null) {
					min=root.left.data;
					root=root.left;
					
				}
				return min;
			}
			
			public boolean Search(int key) {
				return searchBinaryTree(root,key);
			}

			private boolean searchBinaryTree(Node root, int key) {
				if(root!=null) {
					if(root.data==key) {
						System.out.println(key+ " data found");
						return true;
					}else if(key<root.data) {
						return searchBinaryTree(root.left,key);
					}else {
						return searchBinaryTree(root.right,key);
					}
				}
				System.out.println(key+ " data not found");
				return false;
			
			}
			
			public boolean searchNonRecursive(int key) {
				return searchBinarytreeNonRecursive(root,key);
			}

			private boolean searchBinarytreeNonRecursive(Node root, int key) {
				if(root!=null) {
					Node temp=root;
					while(temp!=null) {
						if(temp.data==key) {
							System.out.println(key+"Data found.");
							return true;
						}
						else if(key<temp.data) {
							temp=temp.left;
						}
						else {
							temp=temp.right;
						}
						
						
					}
				}
				System.out.println(key+"Not found");
				return false;
				
			}
			
			
	
	
	

}
