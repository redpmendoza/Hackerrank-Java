import java.util.Scanner;

public class JavaOutputFormating{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Initialize variables
		int num[] = new int[3];
		String text[] = new String[3];
		
		// Loop to get all input
		for(int ctr = 0; ctr < 3; ctr++){
			
			// Get string and int
			text[ctr] = in.next();
			num[ctr] = in.nextInt();
		}
		
		// Output line
		System.out.println("================================");
		
		// Output formatted input
		for(int ctr = 0; ctr < 3; ctr++){
			System.out.printf("%-15s%03d\n", text[ctr], num[ctr]);
		}
		
		//Output line
		System.out.println("================================");
	}
}