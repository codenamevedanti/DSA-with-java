package com.demo.test;

public class MyStackListGeneric<T> {
         Node top;
         class  Node{
        	 T data;
        	 Node next;
        	 public Node(T data) {
        		 this.data=data;
                this.next=null;
        	 }
         }
		public MyStackListGeneric() {
			top=null;
		}
		
		public boolean isEmpty() {
			return top==null;
		}
		public void push(T num) {
			Node newnode=new Node(num);
			if(!isEmpty()) {
				newnode.next=top;
				}
				top =newnode;
				System.out.println("Pushed" +num);
			}
		
		public  T pop() {
			if(!isEmpty()) {
//				T num=top.data;
				Node temp=top;
				top=top.next;
				temp.next=null;
				return temp.data;
			}
			System.out.println("stack is Empty!!!");
			return null;
			
			}
		}
         

