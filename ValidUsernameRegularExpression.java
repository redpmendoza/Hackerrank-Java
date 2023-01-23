import java.util.Scanner;

public class ValidUsernameRegularExpression{
	
	// Constructor
	public ValidUsernameRegularExpression(){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get n
		int n = Integer.parseInt(in.nextLine());
		
		// Loop n times
		for(int ctr = 0; ctr < n; ctr++){
			
			// Get input
			String input = in.nextLine();
			
			// Check if input is a valid username
			if(input.matches(UsernameValidator.pattern)){
				System.out.println("Valid");
			}
			else{
				System.out.println("Invalid");
			}
		}
	}
	
	// UsernameValidator class
	class UsernameValidator{
		
		// Create username pattern
		static final String pattern = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
	}	
	
	// Main method
	public static void main(String[]args){
		
		// Reference class
		new ValidUsernameRegularExpression();
	}
}