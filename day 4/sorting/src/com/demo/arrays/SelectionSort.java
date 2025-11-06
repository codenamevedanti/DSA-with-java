package com.demo.arrays;

import java.util.Arrays;

public class SelectionSort {
  
	private static int findNthmin(int[] arr, int start) {
		int minpos=start;
		int min=arr[minpos];
		for(int i=start;i<arr.length;i++) {
			if(arr[i]<min) {
				minpos=i;
				min=arr[i];
			}
		}
		return minpos;

	}
	
	public static void SelectionSortAsec(int arr[]) {
	  for(int i=0;i<arr.length-1;i++) {
		  int minpos=findNthmin(arr,i);
		  int temp=arr[i];
		  arr[i]=arr[minpos];
		  arr[minpos]= temp;
			System.out.println(Arrays.toString(arr));
	  }
  }

	
	private static int findNthmax(int[] arr, int start) {
		int maxpos=start;
		int max=arr[maxpos];
		for(int i=start;i<arr .length;i++) {
			if(max>arr[i-1]) {
				maxpos=i;
				max=arr[i];
				
			
			}
		}
		return maxpos;
		
	}



public static void SelectionSortDesec(int arr[]) {
	  for(int i=0;i<arr.length-2;i++) {
		  int maxpos=findNthmax(arr,i);
		  int temp=arr[i];
		  arr[i]=arr [maxpos];
		  arr [maxpos]= temp;
		  System.out.println(Arrays.toString(arr));
	  }
}




}
