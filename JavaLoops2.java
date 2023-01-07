import java.util.Scanner;

public class JavaLoops2{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get q
		int q = in.nextInt();
		
		// Loop depending on number of query
		for(int ctr = 0; ctr < q; ctr++){
			
			// Get a, b, and n
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			
			// Loop depending on value of n
			for(int ctr2 = 0; ctr2 < n; ctr2++){
				
				// Add b to a and multiply b by 2
				a += b;	
				b *= 2;
				
				// Output a
				System.out.print(a + " ");
			}
			
			// Output a new line
			System.out.println();
		}
	}
}