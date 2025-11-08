package com.demo.stack;
import com.demo.test.*;

public class TestBalancedParantheses {
	 public static void main(String[] args) {
	        String arr[] = {"{{{}}}", "{{[()]}}", "{{[][]()(()}}"};
	        for (int i = 0; i < arr.length; i++) {
	            boolean status = checkParantheses(arr[i]);
	            if (status) {
	                System.out.println("Balanced Parentheses");
	            } else {
	                System.out.println("Unbalanced Parentheses");
	            }
	        }
	    }

    private static boolean checkParantheses(String arr) {
        MyStackListGeneric<Character> st = new MyStackListGeneric<>();
        for (int i = 0; i < arr.length(); i++) {
            char ch1 = arr.charAt(i);
            if (ch1 == '(' || ch1 == '{' || ch1 == '[') {
                st.push(ch1);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char ch2 = st.pop();
                switch (ch1) {
                    case ')' -> {
                        if (ch2 != '(') {
                            return false;
                        }
                    }
                    case '}' -> {
                        if (ch2 != '{') {
                            return false;
                        }
                    }
                    case ']' -> {
                        if (ch2 != '[') {
                            return false;
                        }
                    }
                }
            }
        }
        return st.isEmpty();
    }
}
