package myFirstApp;

import java.util.Random;

public class BabyBlackjack {

	public static void main(String[] args) {
		
		
		int card1 = 0;
		int card2 = 0;
		int card3 = 0;
		int card4 = 0;
		int playerSum = 0;
		int dealerSum = 0;
		
		Random x = new Random();
		card1 = x.nextInt(10)+ 1;
		card2 = x.nextInt(10)+ 1;
		card3 = x.nextInt(10)+ 1;
		card4 = x.nextInt(10)+ 1;
		
		playerSum = card1 + card2;
		dealerSum = card3 + card4;
		
		System.out.println("Player's drew: " + card1  + " and " + card2 + " and your sum is "+ playerSum);
		System.out.println("Dealer's drew: "+ card3 + " and "+ card4 + " and his sum is "+ dealerSum);
		
		if(playerSum > dealerSum) {
			System.out.println("THE PLAYER HAS WON!!!");
		}if(playerSum < dealerSum) {
			System.out.println("The dealer has won");
		}else if(playerSum == dealerSum) {
			System.out.println("Draw. No winner for today");
		}
		
		
		
		
		
	}

}
