package myFirstApp;

import java.util.Scanner;

public class AddingValuesInALoop {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
	Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Number: ");
        num = keyboard.nextInt();
        sum=num+sum;
        while(num!=0){
            System.out.println("The total so far is "+sum+".");
            System.out.print("Number: ");
            num = keyboard.nextInt();
            sum=num+sum;
        }
        System.out.println();
        System.out.println("The total is "+sum+".");
		
	}
}
//		int choice = 0;
//		Scanner scanner = new Scanner(System.in);
//
//		int suma = 0;
//		System.out.println("Pick a number");
//		choice = scanner.nextInt();
//		suma = choice + suma;
//		
//		while (choice != 0) {
//			
//			System.out.println("The total so far is " + suma);
//			choice = scanner.nextInt();
//			System.out.println("Chose another number");
//			suma = choice + suma;
//
//		}
//		if (choice == 0) {
//			System.out.println("This is the end so you can go home now");
//		}
//	}
//
//}
