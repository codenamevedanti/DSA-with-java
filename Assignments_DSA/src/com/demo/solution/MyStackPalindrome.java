package com.demo.solution;
import java.util.Scanner;
import com.demo.test.*;

public class MyStackPalindrome {
	private static final int str = 0;
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str;
//		int original;
//		int remainder;
//		int reversed=0;
		System.out.println("Enetr the string:");
		
		boolean status=checkPalindrome(str);
		if(status) {
				System.out.println("The String is Palindrome.");
		}
		else {
			System.out.println("The given string is not palindrome.");
		}
		
	}
    
	
	public static  int reverse(boolean flag) {
		if(flag) {
			int j=0;
		    for(int i=0;i<j;i++) {
		    	int temp=i;
		    	i=j;
		    	j=temp;
		    	
		    }
		   
		} 
//		else {
//			int str2=new int [count];
//			for(int i=count-1;i>=0;i--) {
//				str2[j]=str[i];
//			}
//			return str2;
//		}
		return str;
	}
	private static boolean checkPalindrome(String str) {
		MYStackGeneric<Character> st=new MYStackGeneric<>();
		 for(int i=0;i<str.length();i++) {
			 Character ch1=str.charAt(i);
			 
			if(str== reverse) {
				st.push(ch1);
			}
			else {
				if(st.isEmpty()) {
					return false;
				}
				
			}
			 
			 
		 }
		 
	}

}
