package com.deepti.learn;

import java.util.HashSet;
import java.util.Scanner;

public class StringAssignment4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string to check pangram");
		String sourceString = sc.nextLine();
		boolean flag = true;
		sourceString = sourceString.toLowerCase();
		if(sourceString.length()<26) {
			System.out.println("entered String is not pangram");
			System.exit(0);
		}
        for(char ch='a';ch<='z';ch++) {
        	if(!sourceString.contains(String.valueOf(ch))) {
        		flag = false;
        	}
        }
        if(flag) {
        	System.out.println("String is pangram");
        } else {
        	System.out.println("String is not pangram");
        }
	}

}
