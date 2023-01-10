import java.util.Scanner;

public class JavaStaticInitializerBlock{
	
	// Create static variables to use in static block
	static int B, H;
	static boolean check = false;
	
	// Static block
	static{
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get b and h
		B = in.nextInt();
		H = in.nextInt();
		
		// Check if b and h is valid
		if(B > 0 && H > 0){
			
			// Change value of check to true
			check = true;
		}
		else{
			
			// Output error
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
	
	// Main method
	public static void main(String[]args){
		
		// Check if input is valid then output area
		if(check){
			System.out.println(B * H);
		}
	}
}