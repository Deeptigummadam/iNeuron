package com.deepti.learn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringAssignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string 1");
		String sourceString = sc.nextLine();
		System.out.println("Please enter string 2");
		String compareString = sc.nextLine();
		
		if(sourceString.length()!=compareString.length()) {
			System.out.println("Strings are not anagram");
			System.exit(0);
		}

		char sourceArray[] = sourceString.toCharArray();
		char compareArray[] = compareString.toCharArray();
		
		Arrays.sort(sourceArray);
		Arrays.sort(compareArray);
		int result = 0;
		for(int i=0;i<sourceArray.length;i++) {
			if(sourceArray[i] != compareArray[i]) {
			   result = 1;
			}
		}
		if(result==0) {
			System.out.println("Strings are anagram");
		} else {
			System.out.println("Strings are not anagram");
		}
	 System.out.println("********************Anagram using hashset*********************");
	 int flag = 0;
	 HashSet<Character> set = new HashSet<Character>();
	 for(int i=0;i<sourceArray.length;i++) {
		 set.add(sourceArray[i]);
	 }

	 for(int i=0;i<compareArray.length;i++) {
		 if(!set.contains(compareArray[i])) {
			 flag = 1;
		 }
	 }
	 if(flag==0) {
		 System.out.println("Strings are anagram");
	 } else {
		 System.out.println("Strings are not anagram");
	 }
	}

}
