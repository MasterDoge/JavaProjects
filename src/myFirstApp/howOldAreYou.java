package myFirstApp;

import java.util.Scanner;

public class howOldAreYou {

	public static void main(String[] args) {
//		Make a program which displays a different message 
		// depending on the age given. Here are the possible responses:
//
//			age is less than 16, say "You can't drive."
//			age is less than 18, say "You can't vote."
//			age is less than 25, say "You can't rent a car."
//			age is 25 or over, say "You can do anything that's legal."
//		

		int age = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your age");
		age = scanner.nextInt();
		if (age < 16) {
			System.out.println("you are not allowed to drive");
		}
		if (age < 18) {
			System.out.println("you are not allowed to vote");
		}
		if (age < 25) {
			System.out.println("you are not allowed to rent a car");
		}
		if (25 < age) {
			System.out.println("you are alowed to do anything that is legal");
		}
		if (age > 95) {
			System.out.println("you are dead so please close eclipse");
		}
		if (age < 0) {
			System.out.println("you are unborn");
		}
scanner.close();
	}
}

