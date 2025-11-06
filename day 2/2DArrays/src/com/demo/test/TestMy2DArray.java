package com.demo.test;

import com.demo.arrays.My2DArray;

public class TestMy2DArray {

	public static void main(String[] args) {
		My2DArray ob=new My2DArray();
		ob.displayData();
		ob.acceptData();
		
		if(ob.isIdentity() ) {
			System.out.println("It is identity matrix");
		}
		else {
			System.out.println("Not a Identity Matrix.");
		}
		
		System.out.println("The column wise rotation is:");
		ob.rotateColumnwise(true, 1);
		
		System.out.println();
		
		System.out.println("The row wise rotation is:");
		ob.rotateRowwise(true, 0);
		ob.displayData();
		
		
		System.out.println("The column sum is:");
		ob.findSumCols();
		
		System.out.println("The row wise sum is:");
		ob.displayData();
	}

}
