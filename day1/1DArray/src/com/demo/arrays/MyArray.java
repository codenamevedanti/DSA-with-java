package com.demo.arrays;

import java.util.Arrays;

public class MyArray {
     private int []arr;
     private int count;
     
     public MyArray() {
    	 arr=new int [10];
    	 count =0;
     }
     
     public MyArray(int[] arr) {
    	 arr=new int [10];
    	 count=0;
     }
     
     public  MyArray(int []arr,int count) {
    	 this.arr=arr;
    	 this.count=count;
     }
     
     public int getCapacity() {
    	 return arr.length;
     }
     
     public int getSize() {
    	 return count;
     }
     public  boolean addatEnd(int x) {
    	 if(count<arr.length) {
    		 arr[count]=x;
    		 count++ ;
    		 return true;
    	 }
    	 return false;
    	 }
   
    public boolean addatPos(int value,int pos) {
    	if(count<arr.length && pos<count) {
    		for(int i=count ;i>pos;i--){
    			arr[i]=arr[i-1];
    		}
    		arr[pos]=value;
    		count++;
    		return true;
    		
    	}
    	return false;
    	 
     }
    
    public int serachByValue(int value) {
    	for(int i=0;i<count;i++) {
    		if(arr[i]==value)
    		
    			return i;
    		
    	}return -1;
    	
    }
    
    
    public boolean deleteByPosition(int pos) {
    	if(pos<count) {
    		for(int i=pos;i<count -1;i++) {
    			arr[i]=arr[i+1];
    		}count--;
        	return true;
    	}return false;
    } 
    
    
  public boolean deleteByValue(int value) {
	  int idx=serachByValue(value);
	  if(idx != -1) {
		  return deleteByPosition(idx);
	  }
	  return false;
  }
   
  //rigth rotation
  public void rotateArray(boolean flag,int num) {
	  if(flag) {
		  for(int cnt=0;cnt<num;cnt++) {
			  int temp=arr[count-1];
			  for(int i=count-1;i>0;i--) {
				  arr[i]=arr[i-1];
			  }
			  arr[0]=temp;
		  }
	  }
//	  if flag is false then left rotation
	  else {
		  for(int cnt=0;cnt<num;cnt++) {
			  int temp2=arr[0];
			  for(int i=0;i<count-1;i++) {
				  arr[i]=arr[i+1];
			  }
			  arr[count-1]=temp2;
		  }
		 
	  }
  }
  
  
  public int[] reverseArray(boolean flag) {
	  if(flag) {
		  for  (int i=0,j=count-1;i<j;i++,j--) {
			  int temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
		  }
		  return arr;
	  }
	  else {
		  int arr1[]=new int[count];
		  for(int i=count-1,j=0;i>=0;i--,j++) {
			  arr1[j]=arr[i];
		  } return arr1;
	  }
	 
  }
  
  
  public int findMax() {
	  int max=arr[0];
	  for(int i=0;i<count;i++) {
		  if (max<arr[i]) {
			  max=arr[i];
		  }
	  }
	return max; 
  }
  
  
  public int[] exchangeIndexValue() {
	  int size1=findMax();
	  int[] arr1=new int [size1+1];
	  for(int i=0 ;i <arr1.length;i++) {
		  arr1[i]=-1;
	  }
	  
	  for(int i=0;i<count;i++) {
		  int idx=arr[i];
		  int value=i;
		  arr1[idx]=value;
	  }
	  return arr1;
  }
  
  
  public int findSum() {
	  int sum=0;
	  for(int i=0;i<count;i++) {
		  sum=sum+arr[i];
	  }
	return sum;
  }
  
  
  
  public String toString() {
	  return "MyArray:[arr="+Arrays.toString(arr)+"]";
  }
}