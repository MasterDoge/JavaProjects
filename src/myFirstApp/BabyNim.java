package myFirstApp;

import java.util.Scanner;

public class BabyNim {

	public static void main(String[] args) {
		int pileA = 3;
		int pileB = 3;
		int pileC = 3;
		int remove = 0;
		String pile = " ";
		
		Scanner scanner = new Scanner(System.in);

		while (pileA > 0 || pileB > 0 || pileC > 0) {
			System.out.println("A = " + pileA + " B = " + pileB + " C = " + pileC);
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
			} else if (pile.equals("C")) {
				pileC = pileC - remove;
				System.out.println();
			}
			if (pileA <= 0 && pileB <= 0 && pileC <= 0) {
				
				System.out.println("A = " + pileA + " B = " + pileB + " C = " + pileC);
				System.out.println();
				System.out.println("GAME OVER");
			}
		}

	}
}
