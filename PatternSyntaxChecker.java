import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get n
		int N = Integer.parseInt(in.nextLine());
		
		// Loop n times
		for(int ctr = 0; ctr < N; ctr++){
			
			// Get pattern to check
			String p = in.nextLine();
			
			// Try compiling the input pattern if valid or not
			try{
				Pattern pattern = Pattern.compile(p);
				System.out.println("Valid");
			}
			catch(Throwable t){
				System.out.println("Invalid");
			}
		}
	}
}