package myFirstApp;

import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class CreepyHouse {

	public static void main(String[] args) {
		String answer = " ";

		Scanner scanner = new Scanner(System.in);
		System.out.println("You are in a creepy house!!!");
		System.out.println("Would you like to go upstairs or into the kitchen?");

		answer = scanner.nextLine();
		if (answer.equals("kitchen")) {
			System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\r\n"
					+ "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\r\n"
					+ "or look in a \"cabinet\".");
			answer = scanner.nextLine();
			// nested if/bucla imbricata
			if (answer.equals("refrigerator")) {
				System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\r\n"
						+ "Would you like to eat some of the food? (\"yes\" or \"no\")");
				answer = scanner.nextLine();
				if (answer.equals("yes")) {
					System.out.println("You won the game! The prize is waiting for you!");
				} else if (answer.equals("no")) {
					System.out.println("You die of starvation... Eventualy");
				}
			} else if (answer.equals("cabinet")) {
				System.out.println("You die of starvation... Eventually");
			}
		} else if (answer.equals("upstairs")) {
			System.out.println("Upstairs you see a hallway.");
			System.out.println("At the end of the hallway is the master\r\n" + "\"bedroom\".");
			System.out.println("There is also a \"bathroom\" off the hallway");
			System.out.println("  Where would you like\r\n" + "to go?");
			answer = scanner.nextLine();
			if (answer.equals("bedroom")) {
				System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. ");
				System.out.println("The\r\n" + "bed is unmade.");
				System.out.println("In the back of the room, the closet door is ajar.");
				System.out.println(" Would you\r\n" + "like to open the door? (\"yes\" or \"no\")");
				answer = scanner.nextLine();
				if (answer.equals("yes")) {
					System.out.println("In the closet there is a chuckie that will eat you alive.");
					System.out.println("You reached the end of the game.");
					System.out.println("Better luck next time!");
				} else if (answer.equals("no")) {
					System.out.println("You will not know what is in the closet but you will live.");
				}
				
			}
			if(answer.equals("bathroom")) {
				System.out.println("The floor brakes and you die. ");
				System.out.println("Better luck next time!");
				answer = scanner.nextLine();
			}


		}
	}

}
