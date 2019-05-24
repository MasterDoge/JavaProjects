package myFirstApp;

import java.util.Scanner;

public class TenTimes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String message = "";
		System.out.println("Write something and I will display it 10 times");
		message = scanner.nextLine();
		for(int n = 1 ; n <= 10 ; n = n+1) {
			System.out.println(n +". "+ message);
		}
		
		

	}

}
