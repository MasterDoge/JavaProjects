package myFirstApp;

import java.util.Random;
import java.util.Scanner;

public class TheWorstGuessingGame {

	public static void main(String[] args) {
		Random r = new Random();
		int number = 1 + r.nextInt(10);
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		int tries = 0;
		System.out.println("Please, enter your number");
		choice = scanner.nextInt();
		tries++;
		do {
			System.out.println("You are not right!!!");
			System.out.println("Please, try again");
			choice = scanner.nextInt();
			tries++;
	
		}
		while (choice != number && tries < 3); 
			
		

		if (number == choice) {
			System.out.println("You tried " + tries + " times");
			System.out.println("You won 1.000.000 dolars!!!");
		} else
			System.out.println("You are out of tries");

	}

}
