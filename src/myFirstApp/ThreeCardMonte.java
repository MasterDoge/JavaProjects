package myFirstApp;

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		int nrAleator = 1 + r.nextInt(3);
		int choice = 0;
		System.out.println("Which one is the ace?");
		System.out.println("### ### ###");
		System.out.println("### ### ###");
		System.out.println(" 1   2   3 ");
		choice = scanner.nextInt();
		if (choice == nrAleator) {
			if (nrAleator == 1) {
				System.out.println("AAA ### ###");
				System.out.println("AAA ### ###");
				System.out.println(" 1   2   3 ");
			} else if (nrAleator == 2) {
				System.out.println("### AAA ###");
				System.out.println("### AAA ###");
				System.out.println(" 1   2   3 ");
			} else if (nrAleator == 3) {
				System.out.println("### AAA ###");
				System.out.println("### AAA ###");
				System.out.println(" 1   2   3 ");
			}
		}else
			System.out.println("Ha! Fast Eddie wins again! The ace was card number "+ nrAleator);

	}

}
