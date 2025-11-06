package com.demo.test;
import com.demo.search.SerchingService;


public class TestSearch {
	public static void main(String []args) {
		int arr[]= {11,23,34,56,78,99,102};
		
		
		int pos=SerchingService.SequentialSearch(arr,99);
		if(pos== -1) {
			System.out.println("Number not found at position " +pos);
		}
		else {
			System.out.println("Number  found at position " +pos);
		}
		
		
		int[] arr1= {1,2,3,4,5,6,7};
		int pos1=SerchingService.binarySearchRecursion(arr1,1, 0, 3);
		if(pos1== -1) {
			System.out.println("Number not found at position " +pos1);
		}
		else {
			System.out.println("Number  found at position " +pos1);
		}
		
		int pos2=SerchingService.binarySeachNonRecursive(arr1,3);
		if(pos2== -1) {
			System.out.println("Number not found at position " +pos2);
		}
		else {
			System.out.println("Number  found at position " +pos2);
		}
		
	}

}
