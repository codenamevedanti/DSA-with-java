package com.demo.test;
import com.demo.singlycircular.*;
public class TestSinglyCircular {

	public static void main(String[] args) {
		SinglyCircularLinkedList clist=new SinglyCircularLinkedList();
		System.out.println("This is   Example of singlly circular linked list.");
		  clist.addNode(12);
		  clist.addNode(10);
		  clist.addNode(6);
		  clist.addNode(1); 
		  clist.addNode(3);
		  clist.displayData();
		
		  System.out.println("Add by position: ");
		clist.addByPosition(5, 45);
		clist.displayData();
		
		System.out.println("Delete by position:");
		clist.deleteByPosition(3);
		clist.displayData();
		
		System.out.println("Delete by value:");
		clist.deleteByValue(1);
		clist.displayData();
		
		
		
	    

	}

}