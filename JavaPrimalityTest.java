import java.util.Scanner;
import java.math.*;

public class JavaPrimalityTest{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get n
		BigInteger n = in.nextBigInteger();
		
		// Check if n is prime
		if(n.isProbablePrime(100)){
			System.out.println("prime");
		}
		else{
			System.out.println("not prime");
		}
	}
}