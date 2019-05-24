package myFirstApp;

import java.util.Scanner;

public class AlphabeticalOreder {

	public static void main(String[] args) {

		String name = " ";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter your name");
		name = scanner.nextLine();
		if(name.compareTo("Carswell") <= 0){
			System.out.println("You don't have to wait long "+ name);
		}
		else if (name.compareTo("Jones") <= 0) {
			System.out.println("that's not bad "+ name );
		}
		else if (name.compareTo("Smith") <= 0) {
			System.out.println("looks like a bit of a wait "+ name);
		}
		else if (name.compareTo("Young") <= 0) {
			System.out.println("it's gonna be a while "+ name);
		}
	}

}
