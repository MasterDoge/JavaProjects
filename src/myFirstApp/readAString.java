package myFirstApp;

import java.util.Scanner;

public class readAString {

	public static void main(String[] args) {
// 1. declare a string
    String answer = " ";		
// 2. declare the scanner
		Scanner scanner = new Scanner(System.in);
//		3. display a message on the console
		System.out.println("are you ready for a quiz?");
//		4. read the variable from the console
		answer = scanner.nextLine();
//		5. compare the string with the others
		if (answer.equals("yes")) {
		System.out.println("let's start the quiz");	
		}
		else if (answer.equals("no")) {
		System.out.println("ok, bye bye");	
		}
		
//		6. returns a result

	}
	

}
