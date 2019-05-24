package myFirstApp;

import java.util.Scanner;

public class calculatorVolum {

	public static void main(String[] args) {
		// se declara variabilele pe care le vom folosi in program
		
		int lungime = 0;
		int latime = 0;
		int inaltime = 0;
		int volum = 0;
		// se declara un obiect nou de tip scanner
		//scanner citeste valori de la tastatura
		//
		Scanner scanner =new Scanner(System.in);
		//se afiseaza un mesaj in consola
		System.out.println("introduceti lungimea");
		//se preia valoarea variabilei de la tastatura
		lungime = scanner.nextInt();
		System.out.println("introduceti latimea");
		latime = scanner.nextInt();
		System.out.println("introduceti inaltimea");
		inaltime = scanner.nextInt();
        volum = lungime * latime * inaltime;
		System.out.println("volumul este egal cu " + volum);
	}
}
