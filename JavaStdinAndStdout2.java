import java.util.Scanner;

public class JavaStdinAndStdout2{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get int, double, and string
		int a = in.nextInt();
		double b = in.nextDouble();
		in.nextLine();
		String c = in.nextLine();
		
		// Output input int, double, and string
		System.out.println("String: " + c + "\nDouble: " + b + "\nInt: " + a);
	}
}