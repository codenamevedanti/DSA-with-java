package cpm.demo.linkedlist;

import com.demo.beans.Employee;

public class EmployeeSinglyList {
		Node head;
		class Node{
			Employee data;
			Node next;
			public Node(Employee data) {
				this.data=data;
				this.next=null;
			}
		}
		
	
		public EmployeeSinglyList() {
			head=null;
		}

		public void addnode(Employee ob) {
			Node newNode=new Node(ob);
			
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
		public void modifySalById(int empno,double newsal) {
			Node temp=head;
			while(temp!=head && temp.data.getEmpno()!=empno) {
				temp=temp.next;
			}
			if(temp!=null) {
				temp.data.setSal(newsal);
				System.out.println("Salary Updated.");
			}else {
				System.out.println(empno + "Not Found.");
			}
		}
		
		public void addByPosition(int pos,Employee ob) {
			Node newNode=new Node(ob);
			if(pos==1) {
				//add at the head node
				newNode.next=head;
				head=newNode;
			}else {
				//add in between or at the end
				Node temp=head;
				for(int i=1;temp!=null && i<=pos-2;i++) {
					temp=temp.next;
				}
				if(temp!=null) {
					newNode.next=temp.next;
					temp.next=newNode;
				}else {
					System.out.println("Given position "+pos+"  is beyond the length of the list");
				}
			}
		}
		public void deleteByValue(int empno) {
			Node temp=head;
			
			if(head.data.getEmpno()==empno) {
				head=temp.next;
				temp.next=null;
			}else {
				Node prev=null;
				while(temp!=null && temp.data.getEmpno()!=empno) {
					prev=temp;
					temp=temp.next;
				}
			
				if(temp!=null) {
					prev.next=temp.next;
					temp.next=null;
				}else {
					System.out.println(empno + " not found");
				}
			}
		}
		
		
		public void displaydata() {
			if(head==null) {
				System.out.println("The List is Empty.");
			}
			else {
				for(Node temp=head;temp!=null;temp=temp.next) {
					System.out.print(temp.data+"--->");
				}
				System.out.println("null");
			}
		}
	}



