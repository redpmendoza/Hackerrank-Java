import java.util.Scanner;

public class JavaStringReverse{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get a
		String A = in.nextLine();
		
		// Create b to store reverse of a
		String B = "";
		
		// Reverse a and store to b
		for(int ctr = 0; ctr < A.length(); ctr++){
			B = A.charAt(ctr) + B;
		}
		
		// Check if a is a palindrome and output yes or no
		if(A.equals(B)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}