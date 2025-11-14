package com.demo.test;
import com.demo.beans.*;
import java.util.Scanner;
import com.demo.algorithm.*;

public class TestSort {

	public static void main(String[] args) {

		EmployeeSort [] emp =new EmployeeSort[20];

		 int n=0;
		 
		 emp[n++]= new EmployeeSort(1,58725,"Mahesh");
		 emp[n++]= new EmployeeSort(2,587,"Maneka");
		 emp[n++]= new EmployeeSort(3,869086,"Manik");
		 emp[n++]= new EmployeeSort(4,500000,"Suresh");
		 emp[n++]= new EmployeeSort(5,587,"Jack");
		 emp[n++]= new EmployeeSort(6,58725,"Rahul");
		 emp[n++]= new EmployeeSort(7,50,"Veena");
		 emp[n++]= new EmployeeSort(8,1200,"Raghu");
		 emp[n++]= new EmployeeSort(9,3400,"Adhira");
		 emp[n++]= new EmployeeSort(10,65987,"Nandan");
		 emp[n++]= new EmployeeSort(11,2234,"Naresh");
		 emp[n++]= new EmployeeSort(12,100000,"Ruplai");
		 emp[n++]= new EmployeeSort(13,500,"Nilesh");
		 emp[n++]= new EmployeeSort(14,10000,"Mahendra");
		 emp[n++]= new EmployeeSort(15,80000,"Priya");
		 
		 System.out.println("before Sorting:");
		 for(int i=0;i<n;i++) {
			 emp[i].display();
		 }
		 
		 MySortingClass.bubbleSortSal(emp,n);
		 
		 System.out.println("After Sorting:");
		 for(int i=0;i<n;i++) {
			 emp[i].display();
		 }
		 
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<2;i++) {
			 System.out.println("Enter emp id,sal, emp name");
			 int empid=sc.nextInt();
			int sal=sc.nextInt();
			String ename=sc.next();
			emp[n++]=new EmployeeSort(empid,sal,ename);
			 
		 }
		 
		 MySortingClass.insertElementUsingInsertionSort(emp,n);
		 
		

		 
		
		

	}

}
