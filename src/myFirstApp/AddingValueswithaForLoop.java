package myFirstApp;

import java.util.Scanner;

public class AddingValueswithaForLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		int sum = 0;

		System.out.println("Number: ");
		choice = scanner.nextInt();

		System.out.println();

		for (int n = 1; n <= choice; n++) {
			System.out.print(n + "    ");
			sum = choice * (choice + 1) / 2;

		}
		System.out.println();
		System.out.println(sum);
	}

}
