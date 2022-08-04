package com.deepti.learn;

import java.util.Scanner;

public class LaunchGame {
	
	public static void main(String[] args) {
		int low,high;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the low range ");
		low = sc.nextInt();
		System.out.println("Please enter the high range ");
		high = sc.nextInt();
		UmpirePerson umpire = new UmpirePerson();
		umpire.getGuesserNumber(low,high);
		umpire.getPlayersGuessValues(low,high);
		//umpire.displayPlayers();
		umpire.compare();
    }

}
