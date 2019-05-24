package myFirstApp;

import java.util.Scanner;

public class weekDay {

	public static void main(String[] args) {
		int day = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("introduceti un numar "
				+ "pentru a verifica ziua saptamanii");
		System.out
				.println("1 = monday, 2 = tuesday,"
						+ " 3 = wednesday, 4 = thursday, "
						+ "5 = friday, 6 = saturday, 7 = sunday");
		day = scanner.nextInt();

		if (day == 1) {
			System.out.println(day + " is Monday");
		}
		if (day == 2) {
			System.out.println(day + " is Tuesday");
		}
		if (day == 3) {
			System.out.println(day + " is Wednesday");
		}
		if (day == 4) {
			System.out.println(day + " is Thursday");
		}
		if (day == 5) {
			System.out.println(day + " is Friday");
		}
		if (day == 6) {
			System.out.println(day + " is Saturday");
		}
		if (day == 7) {
			System.out.println(day + " is Sunday");
		} else if (day > 7) {
			System.out.println("error, please retry");
		}
	}

}
