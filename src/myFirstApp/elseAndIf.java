package myFirstApp;

import java.util.Scanner;

public class elseAndIf {

	public static void main(String[] args) {
		/*
		 * create a program that compares the numbers of people, cars and buses in a
		 * city 1 - if cars are more than people display "we should take cars" 2 - if
		 * cars are less than people display "we should not take cars" 3 - else display
		 * "we can't decide"
		 */
		int cars = 0;
		int people = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of cars");
		cars = scanner.nextInt();
		System.out.println("enter the number of people");
		people = scanner.nextInt();
		if (cars > people) {
			System.out.println("we should take cars");

		}
		if (cars < people) {
			System.out.println("we should not take cars");
		} else
			System.out.println("we can't decide");
		scanner.close();
	}

}
