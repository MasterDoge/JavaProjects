package myFirstApp;

import java.util.Scanner;

public class TwoQuestions {

	public static void main(String[] args) {
		String answer = " ";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it.");

		System.out.println("Question I");
		System.out.println("Is it animal, vegetable, or mineral?");
		// citim raspunsul de la tastatura
		answer = scanner.nextLine();
		if (answer.equals("animal")) {
			System.out.println("Is it bigger than a bread box?");
			answer = scanner.nextLine();
			// nested if/bucla imbricata
			if (answer.equals("yes")) {
				System.out.println("My guess is that you are thinking of a moose");
			} else {
				System.out.println("My guess is that you are thinking of a squirrel");
			}
		} else if (answer.equals("vegetable")) {
			System.out.println("Is it bigger than a bread box?");
			answer = scanner.nextLine();
			if (answer.equals("yes")) {
				System.out.println("My guess is that you are thinking of a watermelon");
			} else {
				System.out.println("My guess is that you are thinking of a mango");
			}

		} else if (answer.equals("mineral")) {
			System.out.println("Is it bigger than a bread box?");
			answer = scanner.nextLine();
			if (answer.equals("yes")) {
				System.out.println("My guess is that you are thinking of a camaro");
			} else {
				System.out.println("My guess is that you are thinking of a paper clip");
			}
		}

	}
}
