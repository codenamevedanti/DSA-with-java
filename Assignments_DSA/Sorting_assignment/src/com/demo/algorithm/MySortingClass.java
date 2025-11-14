package com.demo.algorithm;
import com.demo.beans.*;
import java.util.Scanner;

import java.util.Arrays;

import com.demo.beans.EmployeeSort;

public class MySortingClass {
	  public static void bubbleSortSal(EmployeeSort []emp,int n) {
		  for(int i=0;i<n-1;i++) {
//			  boolean flag=false;
			for(int j=0;j<n-i-1;j++) {
				if(emp[j]. getSal()>emp[j+1].getSal()) {
//					flag=true;
					EmployeeSort temp = emp[j];
                    emp[j] = emp[j + 1];
                    emp[j + 1] = temp;
				}
				
			}
			System.out.println("Iteration:" +i);
			System.out.println(Arrays.toString(emp));
		  }
	  }
		  
		  public static void insertElementUsingInsertionSort(EmployeeSort []emp,int n) {
			  
			  for(int i=1;i<n;i++) {
				  EmployeeSort key=emp[i];
				  int j=i-1;
				  while (j >= 0 && emp[j].getSal() > key.getSal()) {
			            emp[j + 1] = emp[j];
			            j--;
			        }
			        emp[j + 1] = key;
			    }
			System.out.println("After Insertion Sort:");
			  System.out.print(Arrays.toString(emp));
		  }
			  
		  }
//			 
//		  
		  
	  
	  
	 
	  


