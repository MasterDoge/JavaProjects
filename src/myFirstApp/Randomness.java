package myFirstApp;

import java.util.Random;

public class Randomness {

	public static void main(String[] args) {
		//declaram un obiect de tip random
		
		Random r = new Random();
		//retinem intr o variabila X numarul aleator generat cu obiectul r
		int x = 1 + r.nextInt(10);
		//afisam variabila X care a retinut numarul aleator
		System.out.println("Numarul aleator este "+ x);
		
	}

}
