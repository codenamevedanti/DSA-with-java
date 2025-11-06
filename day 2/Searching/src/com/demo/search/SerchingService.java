package com.demo.search;

public class SerchingService {
	
	
	
	public static int SequentialSearch(int [] arr,int search) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				return i;
			}
		}
		return -1;

		
	}
	
	
	public static int binarySearchRecursion(int arr[],int low,int high,int search) {
		if(low<=high) {
			int mid= (low+high)/2;
			if(arr[mid]==search ) {
				return mid;
			}
			else if(arr[mid]>search) {
				return binarySearchRecursion(arr,low,mid-1, high);
			}
			else{
				return binarySearchRecursion(arr,high,low,mid+1);
			}
		}return -1;
	}




public static int binarySeachNonRecursive(int arr[],int search) {
                      int low=0;
                      int high=arr.length-1;
                      int cnt=0;
                      while(low<=high) {
                    	 int  mid=(low+high)/2;
                    	  cnt++;
                      
                    	  if(arr[mid]==search) {
                    		  return mid;
                             }
                    	   else if(search<arr[mid]){
                    		  high=mid-1;
                    	  }
                    	  else {
                    		  low=mid+1;
                    	  }
                    	

           }
					return -1;
}
}