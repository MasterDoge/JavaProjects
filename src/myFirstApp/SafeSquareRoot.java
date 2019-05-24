package myFirstApp;

import java.util.Scanner;

public class SafeSquareRoot {

	public static void main(String[] args) {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		double root = 0;

		System.out.println("SQUARE ROOT!");
		System.out.println("Chose a number and I will find out his square");

		do {

			choice = scanner.nextInt();
			System.out.println("You can't take the square root of a negative number, silly");

		} while (choice < 1);
		root = Math.sqrt(choice);
		System.out.println("The square root of " + choice + " is " + root);

	}

}
