import java.util.Scanner;

public class JavaIfElse{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get n
		int n = in.nextInt();
		
		// Check if n is
		if(n % 2 == 0){
			
			// Check if n is 2 - 5
			if(n  >= 2 && n <= 5){
				System.out.print("Not Weird");
			}
			
			// Check if n is 6 - 20
			else if(n >= 6 && n <= 20){
				System.out.print("Weird");
			}
			
			// n is greater than 20
			else{
				System.out.print("Not Weird");
			}
		}
		
		// n is odd
		else{
			System.out.print("Weird");
		}
	}
}