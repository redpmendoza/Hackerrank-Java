import java.util.Scanner;

public class JavaIntToString{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Try to convert n to string
		try{
			
			// Get n
			int n = in.nextInt();
			
			// Convert n to string
			String s = Integer.toString(n);
		}
		catch(Exception e){
			
			// Output wrong answer and end program
			System.out.println("Wrong answer");
			return;
		}
		
		// Output good job
		System.out.println("Good job");	
	}
}