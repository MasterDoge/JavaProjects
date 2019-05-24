package myFirstApp;

import java.util.Scanner;

public class checkVowels {

	public static void main(String[] args) {
		/*
		 * write a program to check the vowels read from the keyboard
		 */
		char letter = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("please, enter the letter");
		letter = scanner.next().charAt(0);

		
		if (letter == 'a' || letter == 'e' || letter == 'i' ||
				letter == 'o' || letter == 'u'
				|| letter == 'A') {
			System.out.println(letter + " is a vowel");
		} else
			System.out.println(letter + " is a consonant");
		scanner.close();

	}

}
