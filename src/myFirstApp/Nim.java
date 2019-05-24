package myFirstApp;

import java.util.Scanner;



public class Nim {

	public static void main(String[] args) {
		int pileA = 3;
		int pileB = 3;
		int pileC = 3;
		int turns = 0;
		int remove = 0;		
		String pile = " ";
		String player1 = " ";
		String player2 = " ";
		String curentPlayer = " ";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Player1, please enter your name:");
		player1 = scanner.next();
		System.out.println("Player2, please enter your name:");
		player2 = scanner.next();
		
		while (pileA > 0 || pileB > 0 || pileC > 0) {
			
			
			if (turns % 2 == 0) {
				curentPlayer = player1;
				System.out.println("It's "+ player1 + "'s turn");
				turns++;
				
			} else if (turns % 2 > 0) {
				curentPlayer = player2;
				System.out.println("It's "+ player2 + "'s turn");
				turns++;
			}
			
			System.out.println("pileA = " + pileA + " pileB = " + pileB + " pileC = " + pileC);
			System.out.println("Chose a pile");
			pile = scanner.next();
			System.out.println("How many to remove from " + pile);
			remove = scanner.nextInt();

			if (pile.equals("A")) {
				pileA = pileA - remove;
				System.out.println();
			} else if (pile.equals("B")) {
				pileB = pileB - remove;
				System.out.println();
			}else if (pile.equals("C")) {
				pileC = pileC - remove;
				System.out.println();
			}if(pileA <= 0 && pileB <= 0 && pileC <=0) {
				System.out.println("A = " + pileA + " B = " + pileB + " C = " + pileC);
				System.out.println();
				System.out.println("GAME OVER");
				System.out.println(curentPlayer + "is the winner");
			}


			
			

		}

	}

}
