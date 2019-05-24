package myFirstApp;

public class compoundOperators {

	public static void main(String[] args) {
		/*Compound operators
		By combining the assignment operator with an arithmetic operator, 
		we get a composite arithmetic operator. 
		These are: +=
		-=
		*=
		/=
		%=*/
		int rezultat = 1 + 2;
        // rezultatul este 3
        System.out.println("1 + 2 = " + rezultat);
        int rezultatOriginal = rezultat;
 
        rezultat -= 1;
        // rezultatul este 2
        System.out.println(rezultatOriginal + " - 1 = " + rezultat);
        rezultatOriginal = rezultat;
 
        rezultat *= 2;
        // rezultatul este 4
        System.out.println(rezultatOriginal + " * 2 = " + rezultat);
        rezultatOriginal = rezultat;
 
        rezultat /= 2;
        // rezultatul este 2
        System.out.println(rezultatOriginal + " / 2 = " + rezultat);
        rezultatOriginal = rezultat;
 
        rezultat += 8;
        // rezultatul este 10
        System.out.println(rezultatOriginal + " + 8 = " + rezultat);
        rezultatOriginal = rezultat;
 
        rezultat %= 7;
        // rezultatul este 3
        System.out.println(rezultatOriginal + " % 7 = " + rezultat);
	}

}
