package myFirstApp;

import java.util.Scanner;

public class AgeMessages3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//declaram variabilele
		String name = " ";
		int age = 0;
		//preluam valorile variabilelor de la tastatura 
		System.out.println("Enter your name");
		name = scanner.nextLine();
		System.out.println("Enter your age");
		age = scanner.nextInt();
		if(age < 16) {
			System.out.println("You can't drive " + name);
		}
		if(age >= 16 && age <= 17) {
			System.out.println("You can drive but not vote "+ name);
		}
		if(age >= 17 && age <= 24) {
			System.out.println("You can vote but you can't rent a car "+ name);
		}
		if(age > 24) {
			System.out.println("You can do preety much anything "+ name);
		}
			

	}

}
