package myFirstApp;

import java.util.Scanner;

public class CountingMachineRevisited {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int no1 = 0;
		int no2 = 0;
		int no3 = 0;
		
		System.out.println("Count from: ");
		no1 = scanner.nextInt();
		System.out.println("Count to: ");
		no2 = scanner.nextInt();
		System.out.println("Count by: ");
		no3 = scanner.nextInt();
		for( int n = no1; n <= no2 ; n = n + no3) {
			System.out.println(n);
		}

	}

}
