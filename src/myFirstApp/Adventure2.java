package myFirstApp;

import java.util.Scanner;

public class Adventure2
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int nextroom = 1;
		String choice = "";

		while ( nextroom != 0 )
		{
			if ( nextroom == 1 )
			{
				System.out.println( "You are in a weird, dark room.You are scared and alone and you are very hungry" );
				System.out.print( "You can check **The next room** or you can check the **closet**. " );
				choice = keyboard.nextLine();
				if ( choice.equals("The next room") )
					nextroom = 2;
				else if ( choice.equals("closet") )
					nextroom = 3;
				else
					System.out.println( "You can't chose that. Please, try again!" );
			}
			if ( nextroom == 2 )
			{
				System.out.println( "You are in a bright room. You can't see anybody and you are still hungry." );
				System.out.print( "There is nothing to do here. You can only go **back**. " );
				choice = keyboard.nextLine();
				if ( choice.equals("back") )
					nextroom = 1;
				else
					System.out.println( "You can't chose that. Please, try again!" );
			}
			if (nextroom == 3)
			{
				System.out.println("The closet is empty... ");
				System.out.println("Then you see a weird spider that jumps on your face and eat it, but you het rid of it");
				System.out.println("You can also check the **Fridge**");
				choice = keyboard.nextLine();
				if(choice.equals("Fridge")) 
					nextroom = 4;
				else
					System.out.println( "You can't chose that. Please, try again!" );
				if (nextroom == 4) {
					System.out.println("You die of starvation, eventually");
				}
										
				
				
				
			}
		}

		System.out.println( "THE END" );
	}
	
}
