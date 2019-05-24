package myFirstApp;

import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class BMIcategories {

	public static void main(String[] args) {
		//declare variables
		//declare a scanner
		//read the variables from the keyboard
		//apply the BMI formula
		//display  messages according to the result of the formula
		double height = 0;
		double weight = 0;
		Scanner scanner =new Scanner(System.in);
	    System.out.println("Welcome to the BMI calculator!!!");
	    System.out.println("Here we will make some tests on your weight and height");
	    System.out.println("Now lest beggin!!!");
	    System.out.println("Please, enter your height");
	    height=scanner.nextDouble();
	    System.out.println("Please, enter your weight");
	    weight=scanner.nextDouble();
	    double BMI = weight / (height * height);
	    System.out.println("Your BMI is "+ BMI);
	    if (BMI < 18.5) {
	    	System.out.println("You are underweight");
	    }
	    else if (BMI >= 18.5 && BMI < 24.9) {
		   System.out.println("You are normalweight");
	   }
	    else if (BMI >= 25.0 && BMI < 29.9) {
	    	System.out.println("You are overweight");
	    }
	    else {
	    	System.out.println("You are obese");
	    }
	scanner.close();    
	}
	

}
