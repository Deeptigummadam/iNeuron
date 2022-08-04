package com.deepti.learn;

public class UmpirePerson {
	int players[] = new int[3];
	int guessNumber;
	//int low,high;
	
	public void getGuesserNumber(int low,int high) {
		GuesserPerson guesser = new GuesserPerson();
		guessNumber= guesser.setGuessNumber(low,high);
	}

	public void getPlayersGuessValues(int low,int high) {
		Players player = new Players();
		players = player.getPlayersguessNumbers(low,high);
	}
    
	public void compare() {
		int result[] = new int[3];
		for(int i=0;i<players.length;i++) {
			 //System.out.println(players[i]);
			 if(players[i]==guessNumber) {
				 //System.out.println("player"+(i+1)+"has won the game");
				 result[i] = 1;
			 } else {
				 result[i] = 0;
			 }
	    }
      	String playerresult = "Players";
      	int finalResult = 0;
		for(int i=0;i<result.length;i++) {
      		if(result[i]==1) {
      	       	playerresult = playerresult+" " +(i+1)+" ";
      	       	finalResult = 1;
      		}
      	}
	    if(finalResult==1) {
	    	System.out.println(playerresult+"has won the game");
	    } else {
	    	System.out.println("Sorry better luck next time");
	    }
	}
}

