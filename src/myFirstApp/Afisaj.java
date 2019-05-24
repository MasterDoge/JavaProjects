package myFirstApp;

import java.util.Scanner;

public class Afisaj {

	public static void main(String[] args) {
//	1. declare the scanner 
		Scanner keyboard = new Scanner(System.in);
//	2. declare the integer(variable)
        int age=0;
//  3. display a message in the console
       System.out.println("What is your age?");
//  4.read the integer/variable from the keyboard
       age = keyboard.nextInt();
//  5. display the result of computing
       System.out.println("your age is " + age);
//  6. closes the keyboard resource
       keyboard.close();
	}

}
