package com.deepti.learn;

import java.util.Scanner;
import java.util.Stack;

public class StringsAssignment1 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string you want to reverse");
		String sourceString = sc.nextLine();
		String resultString = "";
		if(sourceString.length()==0) {
			System.out.println("Please enter valid string");
		    System.exit(0);
		}
		for(int i=sourceString.length()-1;i>=0;i--) {
			resultString = resultString+sourceString.charAt(i);
		}
        System.out.println("The reverse string is" +resultString);
        
        System.out.println("**********trying using stacks********************");
        String stackresult = "";
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<sourceString.length();i++) {
        	stack.push(sourceString.charAt(i));
        }
        for(int i=0;i<sourceString.length();i++) {
        	stackresult = stackresult+stack.pop();
        }
        
        System.out.println("the reverse string using stack is"+stackresult);
        System.out.println("**********trying using string builder********************");
        StringBuilder sb = new StringBuilder(sourceString);
        sb.reverse();
        System.out.println("the reverse string using string builder: "+sb);
     }
    }
