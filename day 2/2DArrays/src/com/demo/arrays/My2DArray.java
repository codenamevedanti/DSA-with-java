package com.demo.arrays;
import java.util.Scanner;

public class My2DArray {

	private  int[] [] arr; 
		
	
	
	public My2DArray() {
		arr=new int[3][3];
	}
	public My2DArray(int rows,int cols) {
		arr=new int[rows][cols];
	}
	
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enetr value "+i+","+j);
				arr[i][j]=sc.nextInt();
				
			}
		}
	}
	
	public void displayData() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
	}
	
	
	
	public int rotateRowwise( boolean flag,int num) {
		if(flag) {
			int temp[]=arr[0];
			for(int i=0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
			}
		else {
			int temp[]=arr[arr.length];
			for(int i=arr.length-1;i<0;i++) {
				arr[i]=arr[i-1];
			}
			arr[arr.length-1]=temp;
		}
		return 0;
	}
	
	
	public int rotateColumnwise(boolean flag,int num) {
		if(flag) {
			for(int cnt=0;cnt<num;cnt++) {
				
				int[] temp=new int[arr.length];
				for(int i=0;i<arr.length;i++) {
					temp[i]=arr[i][arr[0].length-1];
				}
				
				for(int i=0;i<arr.length;i++) {
					for(int j=arr[0].length-2;j>=0;j--) {
						arr[i][j+1]=arr[i][j];
					}
				}
				
			
				for(int i=0;i<arr.length;i++) {
					arr[i][0]=temp[i];
				}
			}
		}
		
		else {
			for(int cnt=0;cnt<num;cnt++) {
			
				int[] temp=new int[arr.length];
				for(int i=0;i<arr.length;i++) {
					temp[i]=arr[i][0];
				}
				
				for(int i=0;i<arr.length;i++) {
					for(int j=1;j<arr[0].length;j++) {
						arr[i][j-1]=arr[i][j];
					}
				}
				
				
				for(int i=0;i<arr.length;i++) {
					arr[i][arr[0].length-1]=temp[i];
				}
			}
		}
		return 0;
		}
		
		
		
	 public int[] finSumRowwise() {
		 int []sumRows=new int [arr.length];
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[0].length-1;j++) {
				 sumRows[i]+=arr[i][j];
				 
			 }
		 }
		return sumRows;
	 }
	 
	 public int[] findSumCols() {
		 int []sumCols=new int [arr[0].length];
		 for(int i=0;i<arr[0].length;i++) {
			 for(int j=0;j<arr.length;j++) {
				 sumCols[i]=arr[j][i];
			 }
		 }
		return sumCols;
	 }
	 
	 
	 public boolean isIdentity() {
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[0].length;j++) {
				 if(i==j && arr[i][j]==1) {
					 return false;
				 }
				 else if(i!=j && arr[i][j]==0){
					 return false;
				 }
			 }
			
		 }
		return true;
	 }
}
