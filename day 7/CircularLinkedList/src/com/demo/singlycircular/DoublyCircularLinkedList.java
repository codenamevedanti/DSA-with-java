package com.demo.singlycircular;

import com.demo.singlycircular.SinglyCircularLinkedList.Node;

public class DoublyCircularLinkedList {
	    Node head;
		class Node{
			int data;
			Node next;
			
			public Node prev;
			
			public Node(int data) {
				
				this.data = data;
				this.next=null;
			}
		}
		public DoublyCircularLinkedList() {
		head=null;
		}
		

		public void addNode(int val) {
		    Node newNode = new Node(val);
		    if (head == null) {
		        head = newNode;
		        head.next = head;
		        head.prev = head;
		    } else {
		        Node tail = head.prev;
		        tail.next = newNode;
		        newNode.prev = tail;
		        newNode.next = head;
		        head.prev = newNode;
		    }
		}
		
		public void addbypos(int pos,int val) {
			if(head==null) {
				System.out.println("the list is empty");
			}
			Node newNode=new Node(val);
			if(pos==1)
			{
				Node temp=newNode.prev;
				while(temp.next.prev!=head) {
					temp=temp.next;
				}
				newNode.next.prev=head;
				head=newNode.prev;
				temp.next=head;
				
			}
			else {
				Node temp=head;
				int i=1;
				for(;temp.next!=head && i<=pos-2;i++) {
					temp=temp.next;
				}
				if(i>pos-2) {
					newNode.next=temp.next;
					temp.next=newNode;
				}
				else {
					System.out.println("Given Position"+pos+"iss beyond the length of the list.                                                                                                                                         ");
				}
			}
		}
		
		public void deletebypos(int pos) {
			if(pos==1) {
				System.out.println("The list is empty");
			}
			Node temp=head;
			if(pos==1) {
		          Node tail=head;
		          while(tail.next!=head) {
		        	  tail=tail.next;  
		          }
		          if(tail==head) {
		        	  head=null;
		        	  
		          }
		          else {
		        	  head=head.next.prev;
		        	  temp.next=null;
		        	  tail.next=head;
		          }
			}
			else {
				Node prev=null;
				int i=0;
				for(;temp.next!=head &&i<pos-1;i++) {
					prev=temp;
					temp=temp.next;
				}
				if(i==pos-1) {
					prev.next=temp.next;
					temp.next=null;
				}
				else {
					System.out.println("Position not found.");
				}
			}
		}

		
		public void displayData() {
		    if (head == null) {
		        System.out.println("list is empty");
		    } else {
		        Node temp = head;
		        do {
		            System.out.print(temp.data + "--->");
		            temp = temp.next;
		        } while (temp != head);
		        System.out.println("head");
		    }
		}

		
		
			
		
}
