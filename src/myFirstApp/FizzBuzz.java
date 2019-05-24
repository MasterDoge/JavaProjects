package myFirstApp;

public class FizzBuzz {

	public static void main(String[] args) {

		for (int n = 1; n <= 100; n = n + 1) {

			if (n % 3 <= 0) {
				System.out.println(n + " fizz");
			} else if (n % 5 <= 0) {
				System.out.println(n + " buzz");
			} else if (n % 3 <= 0 && n % 5 <= 0) {
				System.out.println(n + " fizz buzz");
			} else {
				System.out.println(n);
			}
		}

	}

}


