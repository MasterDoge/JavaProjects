package myFirstApp;

import java.util.Scanner;

public class calculatorPerimetru {

	public static void main(String[] args) {
		int latura1 = 0;
		int latura2 = 0;
		int latura3 = 0;
		int latura4 = 0;
	    int perimetru = 0;
	    Scanner scanner =new Scanner(System.in);
	    System.out.println("introduceti latura 1");
	    latura1 = scanner.nextInt();
	    System.out.println("introduceti latura 2");
	    latura2 = scanner.nextInt();
	    System.out.println("introduceti latura 3");
	    latura3 = scanner.nextInt();
	    System.out.println("introduceti latura 4");
	    latura4 = scanner.nextInt();
	   perimetru = latura1+latura2+latura3+latura4;
	    System.out.println("perimetrul figurii geometrice este egal cu " + perimetru);
	    
	    
	}

}
