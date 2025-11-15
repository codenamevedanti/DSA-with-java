package com.demo.array;

import java.util.Scanner;

public class My2DArray {
  private int arr[] [];
  private int count;
  
  
  public My2DArray() {
	arr=new int[3][3];
  }
  
  public My2DArray(int rows,int cols) {
	  arr=new int[rows][cols]; 
  }
  
  public int[][] getArr() {
		return arr;
	}

	public void setArr(int[][] arr) {
		this.arr = arr;
	}
   public void acceptData(){
	   Scanner sc=new Scanner(System.in);
	   for(int i=0;i<arr.length;i++) {
		   for(int j=0;j<arr[i].length;j++) {
			   System.out.println("Enter value"+i+","+j);
			   arr[i][j]=sc.nextInt();
		   }
		   
	   }
	   System.out.println("--------------------");
	   
   }
    public void displayData() {
    	for(int i=0;i<arr.length;i++) {
    		 for(int j=0;j<arr[i].length;j++) {
    			 System.out.print(arr[i][j]+"\t");
    			 
    		 }
    		 System.out.println();
    		 
    	}
    	System.out.println("---------------------");
    }
    
    public  static int[] reverseRow(int [] row,boolean flag) {
    	if(flag) {
    		int start=0,end=row.length-1;
    		while(start<end) {
    			int temp=row[start];
    			row[start]=row[end];
    			row[end]=temp;
    			start++;
    			end--;
    		}
    	}
    	return row;
    }
    
   

	public static int[][] reverseAll(int [][]mat){
    	for(int i=0;i<mat.length;i++) {
    		mat[i]=reverseRow(mat[i],true);
    	}
    	return mat;
    }
	
	
	
	public  static int[] reverseCol(int [] col,boolean flag) {
    	if(flag) {
    		int start=0,end=col.length-1;
    		while(start<end) {
    			int temp=col[start];
    			col[start]=col[end];
    			col[end]=temp;
    			start++;
    			end--;
    		}
    	}
    	return col;
    }
	public static int[][] reverseAllCol(int [][]mat){
    	int rows=mat.length;
    	int cols=mat[0].length;
    	
    	for(int j=0;j<cols;j++) {
    		int col[]=new int[rows];
    		
    		for(int i=0;i<rows;i++){
    			col[i]=mat[i][j];
    		}
    		reverseCol(col,true);
    		
    		for(int i=0;i<rows;i++) {
    			mat[i][j]=col[i];
    		}
    		
    		
    	}
		return mat;
    }
	
	
    
	
	public static int maximumOddInRow(int []row) {
		int maxOdd =-1;
		for(int i=0;i<row.length;i++) {
			if(row[i]%2!=0) {
				if(row[i]>maxOdd) {
					maxOdd=row[i];
				}
			}
		}
		return maxOdd;
		
	}
	
	public static int[] maximumOdd(int [][]mat) {
		int [] result=new int[mat.length];
		for(int i=0;i<mat.length;i++) {
			result[i]=maximumOddInRow(mat[i]);
		}
		return result;
	}
	 
	public void calculateAverage() {
		int rows=arr.length;
		int cols=arr[0].length;
		
		float[] rowavg=new float[rows];
		float[] colavg=new float[cols];
		
		//row average
		for(int i=0;i<rows;i++) {
			int sum=0;
			for(int j=0;j<cols;j++) {
				sum+=arr[i][j];
			}
			rowavg[i]=(float) sum/cols;
		}
		
		//column average
		for(int j=0;j<cols;j++) {
			int sum=0;
			for(int i=0;i<rows;i++) {
				sum+=arr[i][j];
			}
			colavg[j]=(float) sum/rows;
		}
		
		//print col avg
		System.out.println("Column Averages:");
		for(int j=0;j<cols;j++) {
			System.out.println("Column" +j+":"+colavg[j]);
		}
		System.out.println("---------------");
		
		//print row avg
		System.out.println("Row Averages:");
		for(int i=0;i<rows;i++) {
			System.out.println("Rows" +i+":"+rowavg[i]);
			
		}
		System.out.println("---------------");
		
		//sum of row averages
		float sumRowAvg=0;
		for(int i=0;i<rows;i++) {
			sumRowAvg+=rowavg[i];
			
		}
		System.out.println("Sum of all row averages:"+sumRowAvg);
		System.out.println("---------------");
		
		//sum of col avg
		float sumColAvg=0;
		for(int j=0;j<cols;j++) {
			sumRowAvg+=colavg[j];
		}
		System.out.println("Sum of all column averages=" +sumRowAvg);
		
	}
}
  
  

