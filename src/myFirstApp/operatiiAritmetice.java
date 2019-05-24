package myFirstApp;

public class operatiiAritmetice {

	public static void main(String[] args) {
		
		/*+ aduare
		- scadere
		* inmultire
		/impartire
		% restul impartiri / modulo
		*/
		
		int x = 12;
		int y = 3;
		double impartire;
		impartire = x / y;
		System.out.println("rezultatul adunarii este " + (x + y));
		System.out.println("rezultatul scaderii este " + (x - y));
		System.out.println("rezultatul inmultiriii este " + (x * y));
		System.out.println("rezultatul impartirii este " + impartire);
		System.out.println("rezultatul impartirii cu rest este " + (x % y));
	}

}
