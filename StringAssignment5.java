package com.deepti.learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StringAssignment5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the source String");
		String sourceString = sc.nextLine();
		String outputString = "";
		HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
		for(int i=0;i<sourceString.length();i++) {
			if(hashmap.containsKey(sourceString.charAt(i))) {
				hashmap.put(sourceString.charAt(i), hashmap.get(sourceString.charAt(i))+1);
			} else {
				hashmap.put(sourceString.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> entry : hashmap.entrySet()) {
			if(entry.getValue()>1) {
				outputString = outputString + entry.getKey();
			}
		}
       System.out.println(outputString);
	}

}
