package myFirstApp;

import java.util.Scanner;

public class CountingMachine {

	public static void main(String[] args) {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Count to : ");
		choice = scanner.nextInt();
		for (int n = 0; n<= choice ; n = n+1) {
			System.out.println(" "+ n);
		}
	}

}
