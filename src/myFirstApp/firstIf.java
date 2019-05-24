package myFirstApp;

import java.util.Scanner;

public class firstIf {

	public static void main(String[] args) {
		int cats = 0;
		int dogs = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the nuber of dogs");
		dogs = scanner.nextInt();
		System.out.println("enter the number of cats");
		cats = scanner.nextInt();

		if (cats > dogs) {
			System.out.println("there are more cats than dogs");

		}
		if (cats < dogs) {
			System.out.println("there are more dogs than cats");
		} else if (cats == dogs) {
			System.out.println("there are the same number of cats and dogs");
		}
		
		scanner.close();
	}

}

