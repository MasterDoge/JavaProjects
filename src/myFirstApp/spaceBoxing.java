package myFirstApp;

import java.util.Scanner;

public class spaceBoxing {

	public static void main(String[] args) {
//		Julio Cesar Chavez Mark VII is an interplanetary space boxer,
//		who currently holds the championship belts for various weight categories on many different 
//		planets within our solar system. However, it is often difficult for him to recall what his 
//		"target weight" needs to be on earth in order to make the weight class on other planets.	
//		Write a program to help him keep track of this.
//
//		It should ask him what his earth weight is, and to enter a number for the planet 
//		he wants to fight on. It should then compute his weight on the destination planet 
//		based on the table below:
//
//		#	Planet	Relative gravity
//		1	Venus	0.78
//		2	Mars	0.39
//		3	Jupiter	2.65
//		4	Saturn	1.17
//		5	Uranus	1.05
//		6	Neptune	1.23
//		So, for example, if Julio weighs 128 lbs. on earth,
/*		then he would weigh just under 50 lbs. on Mars, since Mars' 
		gravity is 0.39 times earth's gravity. (128 * 0.39 is 49.92)
*///		Please enter your current earth weight: 128
//
//		I have information for the following planets:
//		   1. Venus   2. Mars    3. Jupiter
//		   4. Saturn  5. Uranus  6. Neptune
//
//		Which planet are you visiting? 2
//
//		Your weight would be 49.92 pounds on that planet.
		
		
//      1. declare the variables
		double weight;
		int planet = 0;
//		2. decalre the scanner
		Scanner scanner = new Scanner(System.in);
//		3. display a message on the console
		System.out.println("enter your weight");
//		4. read the integer/variable from the console
		weight = scanner.nextDouble();
//		5. display a message on the console
		System.out.println("I have information for the folowing planets:");
		System.out.println(" 1. Venus   2. Mars    3. Jupiter");
		System.out.println(" 4. Saturn  5. Uranus  6. Neptune");
		System.out.println("what planet are you visiting?");
//		6. read the variable from the console
		planet = scanner.nextInt();
//      7. write a if function that compares the planet with the corect answer
//		and computes the weight formula
		if (planet == 1) {
			System.out.println("you are visiting Venus");
			System.out.println("your weight is " + 0.78 * weight);
		}
		if (planet == 2) {
			System.out.println("you are visiting Mars");
			System.out.println("your weight is " + 0.39 * weight);
		}
		if (planet == 3) {
			System.out.println("you are visiting Jupiter");
			System.out.println("your weight is " + 2.65 * weight);
		}
		if (planet == 4) {
			System.out.println("you are visiting Saturn");
			System.out.println("your weight is " + 1.17 * weight);
		}
		if (planet == 5) {
			System.out.println("you are visiting Urans");
			System.out.println("your weight is " + 1.05 * weight);
		}
		if (planet == 6) {
			System.out.println("you are visiting Neptune");
			System.out.println("your weight is " + 1.23 * weight);
		}

	}

}
