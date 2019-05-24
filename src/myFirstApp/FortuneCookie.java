package myFirstApp;

import java.util.Random;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class FortuneCookie {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);

		// decalram variabilele

		int alegereUser=0;
		String response = "";
		System.out.println("Pick a number for a fortune cookie");
		alegereUser = scanner.nextInt();
		int nrAleator = 1 + r.nextInt(6);

		// compararea alegerii utilizatorului cu nr aleator si afisarea mesajelor
		if (nrAleator == 1) {
			System.out.println("random number is " +nrAleator );
			response = "You will find happiness with a new love";
			System.out.println(response);
		} else if (nrAleator == 2) {
			System.out.println("random number is " +nrAleator );
			response = "Stick with your wife";
			System.out.println(response);
		} else if (nrAleator == 3) {
			System.out.println("random number is " +nrAleator );
			response = "The life is going to bee beter";
			System.out.println(response);
		} else if (nrAleator == 4) {
			System.out.println("random number is " +nrAleator );
			response = "You will have bad luck for the rest of your life";
			System.out.println(response);
		} else if (nrAleator == 5) {
			System.out.println("random number is " +nrAleator );
			response = "Don't worry, things will get better";
			System.out.println(response);
		} else if (nrAleator == 6) {
			System.out.println("random number is " +nrAleator );
			response = "You will have luck for the rest of your life";
			System.out.println(response);
		} else if (nrAleator == alegereUser) {
			System.out.println("random number is " +nrAleator );
			response = "You won. Now, if you wish something it will happen";
			System.out.println(response);
		}

	}

}
