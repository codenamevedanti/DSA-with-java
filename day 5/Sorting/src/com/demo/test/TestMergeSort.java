package com.demo.test;

import com.demo.sorting.MergeSort;

public class TestMergeSort {

	public static void main(String[] args) {
		int arr[]= {5,6,7,1,3,4,20,80,1001};
		MergeSort.mergeSortAscending(arr, 0,arr.length-1);

	}

}
