package com.deepti.learn;

import java.util.Scanner;

public class StringAssignment7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter input String");
		String sourceString = sc.nextLine();
		//sourceString = sourceString.toLowerCase(locale)
		//char vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
		String vowels = "aeiouAEIOU";
		int vowCount = 0,cosCount =0;
		for(int i=0;i<sourceString.length();i++) {
			if(vowels.indexOf(sourceString.charAt(i)) != -1) {
				vowCount++;
			} else if(sourceString.charAt(i)>='A' || sourceString.charAt(i)>='Z') {
				cosCount++;
			} else if(sourceString.charAt(i)>='a' || sourceString.charAt(i)>='z') {
				cosCount++;
			}
		}
		System.out.println("The number of vowels:"+vowCount);
		System.out.println("The number of cosonants:"+cosCount);
	}

}
