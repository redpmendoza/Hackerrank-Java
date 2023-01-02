import java.util.Scanner;

public class JavaStdinAndStdout1{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get three integers
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		// Output three integers
		System.out.println(a + "\n" + b + "\n" + c);
	}
}