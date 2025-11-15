package com.demo.test;

import com.demo.array.My2DArray;

public class Test2DArray {

	public static void main(String[] args) {
		My2DArray ob=new My2DArray();
		ob.acceptData();
		ob.displayData();
		
		int reversed[][]= My2DArray.reverseAll(ob.getArr());
		
	    System.out.println("The row wise rotation is:");
	   for(int [] row:reversed) {
		   for(int val:row) {
			   System.out.print(val+"\t");
		   }
		   System.out.println();
		   
	   }
	   
	   System.out.println("---------------------");
	   int rotate[][]= My2DArray.reverseAllCol(ob.getArr());
	   System.out.println("the column wise rotation is:");
	   for(int col[]:rotate)
	   {
		   for(int val:col) {
			   System.out.print(val+"\t");
		   }
		   System.out.println();
	   }
	   
	   
	   
		int []maximumOdd=My2DArray.maximumOdd(ob.getArr());
	     System.out.println("Maximum odd number in each row:");
	     for(int i=0;i<maximumOdd.length;i++) {
	    	 System.out.println("Row"+i+":"+maximumOdd[i]);
	     }
	     System.out.println("---------------------");
	     
	     
	     ob.calculateAverage();
	}
	
	  
	
	

}
