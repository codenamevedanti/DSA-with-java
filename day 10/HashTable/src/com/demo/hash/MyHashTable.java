package com.demo.hash;

public class MyHashTable {
  Node[]heads;
  class  Node{
	  int data;
	  Node next;
	  public Node(int data) {
		  this.data=data;
		  next=null;
		  
	  } 
	  
  }
  public MyHashTable() {
	heads=new Node[10];
	for(int i=0;i<heads.length;i++) {
		heads[i]=null;
	}
  }
public MyHashTable(int size) {
	heads=new Node[size];
	for(int i=0;i<heads.length;i++) {
		heads[i]=null;
	}
	
}
  
public void insertData(int val) {
	Node newNode=new Node(val);
	int pos=val%heads.length;
			if(heads[pos]!=null) {
				newNode.next=heads[pos];
			}
	heads[pos]=newNode;
}



   public  void displaytdata() {
	   for(int i=0;i<heads.length;i++) {
		   Node temp=heads[i];
		   heads[i]=null;
		  System.out.println(i+"----->");
		  while(temp!=null) {
			  System.out.println(temp.data+"--->");
			  temp=temp.next;
		  }
		  System.out.println("Null");
		  
	   }
   }


  
  
  
  
  
}
