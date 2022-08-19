package com.deepti.learn;

import java.util.Scanner;
import java.util.Stack;

public class StringsAssignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String sourceSentence = sc.nextLine();
		String resultString = "";
		String splitArray[] = sourceSentence.split(" ");
		for(int i=0;i<splitArray.length;i++) {
			for(int j=splitArray[i].length()-1;j>=0;j--) {
				resultString = resultString + splitArray[i].charAt(j);
				if(j==0 && i!=splitArray.length-1) {
					resultString = resultString + " ";
				}
			}
		}
        System.out.println("The output using arrays:"+resultString.toLowerCase());
        System.out.println("*******************USING STACKS********************");
        String reverseSentence = "";
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<sourceSentence.length();i++) {
        	if(sourceSentence.charAt(i)!=' ') {
        	  stack.push(sourceSentence.charAt(i));
        	} else {
        		while (!stack.isEmpty()) {
        		  reverseSentence = reverseSentence + stack.pop();
        		}
        		reverseSentence = reverseSentence + " ";
        	} 
        }
        while(!stack.isEmpty()) {
        	reverseSentence = reverseSentence + stack.pop();
        }
		System.out.println("The output using stacks:"+reverseSentence.toLowerCase());
	    System.out.println("***********************USING STRING BUILDER*************************");
	    StringBuilder sb = new StringBuilder();
	    String outputString = "";
	    for(String test:splitArray) {
	    	sb.append(test);
	    	sb.reverse();
	    	outputString = outputString+sb.toString()+ " ";
	    	sb.delete(0, sb.length());
	     }
	    System.out.println("the output using string builer:"+outputString.toLowerCase());
	}
}