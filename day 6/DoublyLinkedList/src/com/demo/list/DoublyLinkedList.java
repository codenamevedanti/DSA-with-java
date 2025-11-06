package com.demo.list;

public class DoublyLinkedList {
	Node head;
	class Node{
		int data;
		Node prev ,next;
		public Node(int data) {
			this.data=data;
			prev=null;
			next=null;
		}
		
	}
	public DoublyLinkedList() {
		head=null;
	}
	
	
	public void addByPos(int pos,int val) {
		Node newNode=new Node(val);
		if(pos==1) {
			newNode.next=head;
			if(head!=null)
				head.prev=newNode;
		}
		else {
			Node temp=head;
			for(int i=1;temp!=null && i<=pos-2;i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.next=temp.next;
				newNode.prev=temp;
				temp.next=newNode;
				if(newNode.next!=null) {
					newNode.next.prev=newNode;
				}
				else {
					System.out.println(pos+"Is beyound the limit.");
				}
			}
		}		
		}
	
	
	public void addNode(int val) {
		
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			newNode.prev=temp;
			temp.next=newNode;
		}
	}
	
	
	public void addByValue(int val,int num) {
		Node newNode=new Node(num);
		if(val==num) {
			newNode.next=head;
			if(head!=null)
				head.prev=newNode;
		}
		else {
			Node temp=head;
			for(int i=1;temp!=null && i<=val-2;i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.next=temp.next;
				newNode.prev=temp;
				temp.next=newNode;
				if(newNode.next!=null) {
					newNode.next.prev=newNode;
				}
				else {
					System.out.println(val+"Is beyound the limit.");
				}
			}
		}		
		}
	
	
	
	public void deleteByValue(int val) {
		   Node temp=head;
		   if(head.data==val) {
			   head.next.prev=null;
			   head=temp.next;
			   temp.next=null;
		   }
		   else {
			   while(temp!=null && temp.data!=val) {
				   temp=temp.next;
			   }
			   if(temp!=null) {
				   temp.prev.next=temp.next;
				   if(temp.next!=null) {
						   temp.next.prev=temp.prev;
						   temp.next=null;
				   }
			   }
			   else {
				   System.out.println(val+"value not found.");
			   }
		   }
	}
	
	public void deleteByPos(int pos) {
		   Node temp=head;
		   if(temp.data==pos) {
			   head.next.prev=null;
			   head=temp.next;
			   temp.next=null;
		   }
		   else {
			   while(temp!=null && temp.data!=pos) {
				   temp=temp.next;
			   }
			   if(temp!=null) {
				   temp.prev.next=temp.next;
				   if(temp.next!=null) {
						   temp.next.prev=temp.prev;
						   temp.next=null;
				   }
			   }
			   else {
				   System.out.println(pos+"position not found.");
			   }
		   }
	}
	
	
	public void displaydata() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"---->");
			temp=temp.next;
			
		}
		System.out.println("null");
	}

}
