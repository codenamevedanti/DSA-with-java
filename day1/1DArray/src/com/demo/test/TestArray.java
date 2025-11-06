package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

import com.demo.arrays.MyArray;

public class TestArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyArray ob=new MyArray();
		System.out.println("The arrays are:" +ob.getCapacity());
		ob.addatEnd(6);
		ob.addatEnd(7);
		ob.addatEnd(4);
		ob.addatEnd(9);
		ob.addatEnd(8);
		System.out.println(ob.getSize());	
	
		System.out.println("The original array is:"+ob);
		
		
//		ob.reverseArray(true);
//		System.out.println("The reversed array is:"+ob);
//		
//		ob.rotateArray(false,2);
//		System.out.println("The  rotated arrya is" +ob);
//		
		
		int arr1[]=ob.exchangeIndexValue();
		IntStream.of(arr1).forEach(e->System.out.print(e+","));
		
//		ob.findSum();
//		System.out.println("The sum is:"+ob);
		
		
		int arr2[]=ob.findSum();
		IntStream.of(arr2).forEach(e->System.out.print(e+","));
		

	}

}
