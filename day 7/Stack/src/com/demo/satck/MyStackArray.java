package com.demo.satck;

public class MyStackArray {
	private int[] arr;
	private int top;
	public MyStackArray() {
		arr=new int[10];
		top=-1;
	}

	
	public MyStackArray(int size) {
		arr=new int[size];
		top=-1;
	}

	
	public void push(int num) {
		if(!isFull()) {
			top++;
			arr[top]=num;
			System.out.println("Pushed into satck" +num);
			
		}else {
			System.out.println("Stack is full");
		}
	}


private boolean isFull() {
	
		return top==arr.length-1;
	}


public int pop() {
if(!isEmpty()) {
	 int num=arr[top];
	top--;
	return num;
	
}else {
	System.out.println("Empty Stack");
	return -1;
	
}
}


private boolean isEmpty() {
	
	return top==-1;
}
}
