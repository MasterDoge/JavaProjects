package myFirstApp;

public class CompareChallenge {

	public static void main(String[] args) {
//		System.out.print("Comparing \"ALB\" with \"ROZ\" produces ");
//		int i = "ALB".compareTo("ROZ");
//		System.out.println(i);
//		
		
		String a1 = "stefan";
		String a2 = "STEFAN";
        int i3 = a1.compareTo(a2);
        System.out.println(i3);
        
        String a3 = "nice";
        String a4 = "care";
        int i4 = a3.compareTo(a4);
        System.out.println(i4);
        
        String a5 = "dog";
        String a6 = "god";
        int i5 = a5.compareTo(a6);
        System.out.println(i5);
        
        String a7 = "orange";
        String a8 = "Orange";
        int i6 = a7.compareTo(a8);
        System.out.println(i6);
        
        int i7 = "a".compareTo("b");
        int i8 = "b".compareTo("a");
        System.out.println(i7 + " " + i8 );
		
	}

}
