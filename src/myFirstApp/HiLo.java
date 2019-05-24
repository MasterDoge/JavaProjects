package myFirstApp;

import java.util.Random;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class HiLo {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		int nrAleator = 1 + r.nextInt(100);
		int tries = 0;

		System.out.println("Pick a number");
		int choice = scanner.nextInt();

		while (choice != nrAleator && tries < 7) {
			tries++;
			
			if (choice < nrAleator) {
				System.out.println("You were too low ");

			} else if (choice > nrAleator) {
				System.out.println("You were too high ");

			}
			choice = scanner.nextInt();
		}
		if (choice == nrAleator) {
			System.out.println("You guessed the number");
		}else if( tries > 7) {
			System.out.println("You are out of guesses");
			
		}
			

	}

}
