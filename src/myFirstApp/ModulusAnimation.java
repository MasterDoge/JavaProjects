package myFirstApp;

public class ModulusAnimation {

	
		public static void main( String[] args ) throws Exception
		{
			for ( int i=0; i<3; i++ ) 
				//bucla for care ii cere programului sa ruleze de un anumit nr de ori
			{
				if ( i%10 == 0 )
					//modulo %
					System.out.print(" Mr. Mitchell is cool. \r");

				Thread.sleep(200);
			}
			
		}
	

	}


