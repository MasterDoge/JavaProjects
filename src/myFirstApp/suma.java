package myFirstApp;

import java.util.Scanner;

public class suma {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int suma = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("introduceti primul numar");
		a = scanner.nextInt();
		System.out.println("introduceti al doilea numar");
		b = scanner.nextInt();
		 suma = a + b;
		System.out.println("suma este egala cu " + suma);

	}

}
