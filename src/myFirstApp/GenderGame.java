package myFirstApp;

import java.util.Scanner;

public class GenderGame {

	public static void main(String[] args) {
		String gender = " ";
		String firstname = " ";
		String lastname = " ";
		int age = 0;
		String answer = " ";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello");
		System.out.println("Please, enter your gender (M or F)");
		gender = scanner.nextLine();
		System.out.println("Please, enter your first name");
		firstname = scanner.nextLine();
		System.out.println("Please, enter your last name");
		lastname = scanner.nextLine();
		System.out.println("Please, enter your age");
		age = scanner.nextInt();
		if (gender.equals("M") && age > 20) {
			System.out.println("Are you married?(Y or N)");
			answer = scanner.next();
			if (answer.equals("Y")) {
				System.out.println("Your name is Mr. " + lastname);
			} else
				System.out.println("Your name is " + firstname + " " + lastname);

		}
	}

}
