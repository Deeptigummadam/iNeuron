package com.deepti.learn;

import java.util.Scanner;

public class StringAssignment6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input String");
        String sourceString = sc.nextLine();
        char temp;
        char inputArray[] = sourceString.toCharArray();
        for(int i=0;i<inputArray.length;i++) {
        	for(int j=i+1;j<inputArray.length;j++) {
        		if (inputArray[j] < inputArray[i]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
        	}
        }
   
        	System.out.println(inputArray);
	}

}
