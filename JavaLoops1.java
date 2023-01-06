import java.util.Scanner;

public class JavaLoops1{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get n
		int n = in.nextInt();
		
		// Output multiplication table
		for(int ctr = 1; ctr < 11; ctr++){
			System.out.println(n + " x " + ctr + " = " + (n * ctr));
		}
	}
}