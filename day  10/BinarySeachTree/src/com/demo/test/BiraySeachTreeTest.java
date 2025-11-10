package com.demo.test;

import com.demo.trees.MyBinarySearchTree;

public class BiraySeachTreeTest {

	public static void main(String[] args) {
		MyBinarySearchTree btree=new MyBinarySearchTree();
		btree.insertNode(23);
		btree.insertNode(3);
		btree.insertNode(45);
		btree.insertNode(56);
		btree.insertNode(12);
		btree.insertNode(67);
		btree.insertNode(15);
		
		System.out.print("preorder: ");
		btree.preorder();
		
		System.out.print("Inorder: ");
		btree.inorder();
		
		System.out.print("Postorder : ");
		btree.postorder();
		
		System.out.print("Delete Node: ");
		btree.deleteNode(45);
		btree.inorder();
		
		System.out.println("Search data: ");
		btree.searchNonRecursive(100);
		
		
		
		
		

	}

}
