import java.util.Scanner;
import java.math.*;

public class JavaBigInteger{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get a and b
		BigInteger a = in.nextBigInteger();
		BigInteger b = in.nextBigInteger();
		
		// Output sum and product of a and b
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
	}
}