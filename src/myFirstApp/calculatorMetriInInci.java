package myFirstApp;

import java.util.Scanner;

public class calculatorMetriInInci {

	public static void main(String[] args) {
//    transforma metri in inci
		double inci=0;
		Scanner scanner =new Scanner(System.in);
	System.out.println("introduceti numarul de metri");
	inci= scanner.nextInt();
	double metri = inci*39.3700787;
	System.out.println("valoare in inci "+ metri);
    scanner.close();
}
}
