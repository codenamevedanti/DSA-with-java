package com.demo.test;
import com.demo.list.*;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList db=new DoublyLinkedList();
		
		System.out.println("The linked list is ");
		db.addNode(12);
		db.addNode(17);
		db.addNode(89);
		db.addNode(2);
		db.addNode(15);
		db.addNode(6);
		 db.displaydata();
		 
		 
//		 System.out.println("Add by position");
//		db.addByPos(2, 20);
//		 db.displaydata();
//		 
//		 
//		 System.out.println("Add by value:");
//		 db.addByValue(7, 23);
//		 db.displaydata();
//		 
//		 System.out.println("Delete by value");
//		 db.deleteByValue(89);
//		 db.displaydata();
//		 
		 System.out.println("Delets by position");
		 db.deleteByPos(4);
		 db.displaydata();
        

	}

}
