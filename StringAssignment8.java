package com.deepti.learn;

import java.util.Scanner;

public class StringAssignment8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter input String");
		String sourceString = sc.nextLine();
		int specialCount =0;
		for(int i = 0; i < sourceString.length(); i++)
        {
            char ch = sourceString.charAt(i);
            if (ch >= 'A' && ch <= 'Z') 
                continue;
            else if (ch >= 'a' && ch <= 'z')
            	continue;
            else if (ch >= '0' && ch <= '9')
            	continue;
            else
                specialCount++;
        }
 
        System.out.println("The number of special characters are: "+specialCount);
	}

}
