package com.deepti.learn;

import java.util.Scanner;

public class GuesserPerson {
  int guessNumber;
  int lowRange;
  int highRange;
public int setGuessNumber(int low,int high) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter guesser number in the range of "+low+"-"+high);
	guessNumber = sc.nextInt();
	//System.out.println(guessNumber);
	if(guessNumber<low || guessNumber>high) {
		//System.out.println("hello");
		System.out.println("Number not accpeted try again");
		System.out.println("Please enter guesser number in the range of "+low+"-"+high);
		guessNumber = sc.nextInt();
		if(guessNumber<low || guessNumber>high) {
			System.out.println("Sorry try next time");
			System.exit(0);
		}
		}
	
	return guessNumber;
}

}
