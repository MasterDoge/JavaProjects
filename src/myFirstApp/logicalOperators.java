package myFirstApp;

import java.util.Scanner;

public class logicalOperators {

	public static void main(String[] args) {
		/*
		 * scrieti un program care 
		 * sa recunoasca daca apartine unei anumite multimi
		 * ex> avem 3 multimi: 1-10, 11-20, 21-30
		 * output: "numarul apartine multimii x"
		 * 
		 * operatori logici
		 * 
		 * && = si daca ambele expresii (din dreapta si stanga operatorului sunt adevarate true)
		 * || = or daca una dintre expresii este adevarata
		 * == = egal
		 * != = nu este egal cu
		 */
	    int numar = 0;
	    Scanner scanner = new Scanner (System.in);
	    System.out.println("introduceti un numar");
	    numar = scanner.nextInt();
	    
	    if (numar >= 1 && numar <= 10 ) {
	    	System.out.println("numarul apartine mutimii de la 1 la 10");
	    }
	    if (numar >= 11 && numar <= 20) {
	    	System.out.println("numarul apartine multimii de la 11 la 20");
	    }
	     if (numar >= 21 && numar <= 30) {
	    	 System.out.println("numarul apartine multimii de la 21 30");
	     }
//	     if (numar >= 1 || numar <= 20 ) {
//	    	 System.out.println("numarul apartine multimii de la 1 la 20");
//	     }
	     else if (numar > 30) {
	    	 System.out.println("eroare, va rugam sa reincercati");
	     }

	}

}
