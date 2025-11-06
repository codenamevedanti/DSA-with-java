package com.demo.arrays;
import java.util.Arrays;

public class BubbleSort {
   
	public static void NormalBubbleSort(int arr[]) {
	  for(int i=0;i<arr.length;i++) {
		  for(int j=0;j<arr.length-i;j++) {
			  int temp=arr[i];
			  arr[j-1]=arr[j];
			  arr[j]=temp;
			  
		  }
		  
		  System.out.println("the comparisons are:");
		  System.out.println(Arrays.toString(arr));
	  }
  }
	
	
	public static bubbleSortImproved(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			boolean flag=false; {
				for(int j=0;j<arr.length-i;j++) {
					
				}
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
}
