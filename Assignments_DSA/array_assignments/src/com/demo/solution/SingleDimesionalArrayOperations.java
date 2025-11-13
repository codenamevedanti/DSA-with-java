package com.demo.solution;
import java.util.Arrays;
import java.util.Scanner;


public class SingleDimesionalArrayOperations {

          private  int arr1[];
            private int count;
			
            
            public SingleDimesionalArrayOperations() {
				arr1=new int[10];
				
				count =0;
				}


//			public SingleDimesionalArrayOperations( int[] arr1, int[] arr2) {
//				arr1=new int[size];
//				arr2=new int[size];
//				count=0;
//			}
			public  SingleDimesionalArrayOperations(int arr1[]) {
				this.arr1=arr1;
				
				count=count;
			}
			
			public int getCapacity() {
				return arr1.length;
			}
			public int getSize() {
				return count;
			}
			
			
			public boolean addindividual(int x) {
				int i=0;
				if(count<arr1.length) {
					arr1[count]=x;
					count++;
				
				}
				return true;
			}
			
			public int findFactorial(int n) {
				int  fact=1;
				for(int i=1;i<=n;i++) {
					
					fact=fact*i;
				}
				return fact;
			}
			
			public int[] findFactorials() {
			    int[] results = new int[count];
			    for (int i = 0; i < count; i++) {
			        results[i] = findFactorial(arr1[i]);
			    }
			    return results;
			}
			
			 public void printFactorials() {
			        int[] results = findFactorials();
			        for (int i = 0; i < count; i++) {
			            System.out.println(arr1[i] + "! = " + results[i]);
			        }
			    }
			 
			 
			 
//			 public boolean findPrimeFactorials(int n) {
//				 if(n==1) {
//					 return false;
//				 }
//				for(int  i=2;i*i<n;i++)
//				       {
//				           if(n%i == 0){
//				           return false;  
//				             }			       
//				 }
//					return true;
//			 }
			 
			 public int[] findPrimeFactorials() {
				    int[] results = new int[count];
				    int index = 0;
				    for (int i = 0; i < count; i++) {
				        if (isPrime(arr1[i])) {
				            results[index++] = findFactorial(arr1[i]);
				        }
				    }
				    return Arrays.copyOf(results, index); // trim unused slots
				}

			
				
					public boolean isPrime(int n) {
					    if (n <= 1) return false;
					    for (int i = 2; i * i <= n; i++) {
					        if (n % i == 0) return false;
					    }
					    return true;
					}



				public void printPrimeFactorials() {
				    int[] results = findPrimeFactorials();
				    int index = 0;
				    for (int i = 0; i < count; i++) {
				        if (isPrime(arr1[i])) {
				            System.out.println(arr1[i] + "! = " + results[index++]);
				        }
				    }
			    }
			 
			 
			 
			 




			@Override
			public String toString() {
				return "SingleDimesionalArrayOperations [arr1=" + Arrays.toString(arr1)  + ", count=" + count + "]";
			}
			
			
			
            
            
            
            
            
           
}
