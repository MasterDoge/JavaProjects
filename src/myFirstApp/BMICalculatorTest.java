package myFirstApp;

import java.util.Scanner;

public class BMICalculatorTest {

	public static void main(String[] args) {
		/*
		 * The body mass index (BMI) is commonly used by health and nutrition
		 * professionals to estimate human body fat in populations.
		 * 
		 * It is computed by taking the individual's weight (mass) in kilograms and
		 * dividing it by the square of their height in meters.
		 * 
		 * 
		 */
		double greutate = 0;
		double inaltime = 0;
		double BMI = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to BMI calculator!!!");
		System.out.println("Please, enter your weight");
		greutate = scanner.nextDouble();
		System.out.println("Please, enter your height");
		inaltime = scanner.nextDouble();
		BMI = greutate / (inaltime * inaltime);
		System.out.println("Your BMI is "+ BMI);
		

	}

}
