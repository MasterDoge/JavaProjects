package myFirstApp;

import java.util.Random;
import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		int suma;
		Random r = new Random();

		Scanner scanner = new Scanner(System.in);
		int random1 = 1 + r.nextInt(6);
		int random2 = 1 + r.nextInt(6);
		suma = random1 + random2;
		do {
			random1 = 1 + r.nextInt(6);
			 random2 = 1 + r.nextInt(6);
			suma = random1 + random2;
			System.out.println("Roll 1 is " + random1);
			System.out.println("Roll 2 is " + random2);
			System.out.println("The total is " + suma);
			
		 System.out.println("Roll 1 is " + random1);
		System.out.println("Roll 2 is " + random2);
		System.out.println("The total is " + suma);
		
		 
		}while (random1 != random2);
			 

		
		

	}
}
