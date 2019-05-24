package myFirstApp;

import java.util.Scanner;

public class EnterPIN
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF Stefan.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != pin ) //daca conditia este adevarata, atunci imi executa codul;
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}
		//entry = pin => conditia nu mai este adevarata

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}
