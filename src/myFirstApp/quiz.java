package myFirstApp;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		String answer = " ";
		int response = 0;
		int scor = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("are you ready for a quiz?");
		answer = scanner.nextLine();
		if (answer.equals("yes")) {
			System.out.println("let's start the quiz");

//			start the quiz
//			1st question
			System.out.println("I. What is the capital of Alaska?");
			System.out.println("1) Melbourne");
			System.out.println("2) Anchorage");
			System.out.println("3) Juneau");

			// read the variable from the console
			response = scanner.nextInt();
			if (response == 2) {
				scor++;
				System.out.println("your answer is corect " + "scor: "+ scor);
			} else
				System.out.println("your answer is incorect");
			
//			2nd question
			System.out.println("II. Can you store the value 'cat' in a variable of type int?");
			System.out.println("1) yes");
			System.out.println("2) no");
			response = scanner.nextInt();
			if(response == 2) {
				
				scor++;
				System.out.println("you are superman " + "scor: "+ scor);
			}
			else
				System.out.println("you were close but not enough");
			
//			3rd question
			System.out.println("III. what is the result of 9 + 6 / 3 ?");
			System.out.println("1) 11");
			System.out.println("2) 5");
			System.out.println("3) 3");
			response = scanner.nextInt();
			if(response == 1) {
				
				scor++;
				System.out.println("I see you are good " + "scor: "+ scor);
			}
			else
				System.out.println("that's quite wrong");
		} else if (answer.equals("no")) {
			System.out.println("ok, bye bye");
		}

	}

}
