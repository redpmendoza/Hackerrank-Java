import java.util.Scanner;

public class JavaEndOfFile{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Create line counter
		int n = 1;
		
		// Loop until end of file
		while(in.hasNext()){
			
			// Output input and increment counter
			System.out.println(n + " " + in.nextLine());
			n++;
		}
	}
}