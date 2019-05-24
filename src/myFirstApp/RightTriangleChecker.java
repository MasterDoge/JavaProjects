package myFirstApp;

import java.util.Scanner;

public class RightTriangleChecker {

	public static void main(String[] args) {
		int side1 = 0;
		int side2 = 0;
		int side3 = 0;
		double teorema = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please, enter 3 sides and I will tell you if your triangle is right!!!");
		System.out.println("side 1 : ");
		side1 = scanner.nextInt();
		do {
			System.out.println("side 2 : ");
			side2 = scanner.nextInt();
			if (side1 > side2) {
				System.out.println("The side1 has to be bigger than the side2 !!!");
			}

		} while (side1 > side2);

		do {
			System.out.println("side 3 : ");
			side3 = scanner.nextInt();
			if (side2 > side3) {
				System.out.println("The second side has to be bigger than the third side !!!");
			}

		} while (side2 > side3);

		System.out.println("side 3 = " + side3);
		System.out.println("side 2 = " + side2);
		System.out.println("side 1  = " + side1);
		teorema = Math.sqrt((side1 * side1)+(side2 * side2));
		if(teorema == side3) {
			System.out.println("Your triangle is a right triangle!!!!!!!!!!!!");			
		}else
			System.out.println("These sides don't make a right triangle. Sorry.");

	}

}
