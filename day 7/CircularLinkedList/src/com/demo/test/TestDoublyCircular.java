package com.demo.test;
import com.demo.singlycircular.*;
public class TestDoublyCircular {

	public static void main(String[] args) {
		DoublyCircularLinkedList dlist=new DoublyCircularLinkedList();
		dlist.addNode(23);
		dlist.addNode(3);
		dlist.addNode(14);
		dlist.addNode(10);
		dlist.addNode(5);
		dlist.displayData();
		
//		dlist.addbypos(3, 45);
//		dlist.displayData();
//		
//		dlist.deletebypos(2);
//		dlist.displayData();
		
		dlist.displaydataReverse();
		9
		dlist.deletebyVal(100);
		
		
		dlist.deletebyVal(14);
		dlist.displayData();
	}

}
