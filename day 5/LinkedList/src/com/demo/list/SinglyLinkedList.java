package com.demo.list;

public class SinglyLinkedList {

	Node head;
	class Node{
		int data;
		Node next;
		public Node(int x) {
			data=x;
			next=null;
		}
	}
	
	public SinglyLinkedList() {
		head=null;
	}
	
	public void addnode(int value) {
		Node newNode=new Node(value);
		
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	
	public void displaydata() {
		if(head==null) {
			System.out.println("The Liust is Empty.");
		}
		else {
			for(Node temp=head;temp!=null;temp=temp.next) {
				System.out.print(temp.data+"--->");
			}
			System.out.println("null");
		}
	}
}
