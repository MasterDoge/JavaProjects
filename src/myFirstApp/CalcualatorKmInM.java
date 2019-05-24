package myFirstApp;

import java.util.Scanner;

public class CalcualatorKmInM {

	public static void main(String[] args) {
		//transforma km in metri
		int km=0;
//		Scanner scanner =new Scanner(System.in);
//		System.out.println("introduceti numarul de km");
//		km= scanner.nextInt();		
//		int metri = km*1000;
//		System.out.println("valoare in metri "+ metri);
		//transforma metri in km
		
//		1. declare a variable 
		double metri=0;
//		2. declare a scanner
		Scanner scanner =new Scanner(System.in);
//		3. display a message in the consolel
		System.out.println("introduceti numaru de metri");
//		4. read the variable from the keyboard with the scanner
		metri= scanner.nextInt();//		5. aplying the formula
		double kilometru = metri/1000;
//		6. display the result of the computation
		 System.out.println("valoare in km "+ kilometru);
		scanner.close();
	}

}





