package myFirstApp;

import java.util.Scanner;

public class XsAndYs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		for(double x = -10; x<=10; x = x+0.5    ) {
			double y = x*x;
			System.out.println(x + " "+ y);
		}

	}

}
