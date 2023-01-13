import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter{
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get payment
		double payment = in.nextDouble();

		// Create currency instance of us, china, and france
		NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		// Create locale for india and get the instance
		Locale india = new Locale("en", "IN");
		NumberFormat i = NumberFormat.getCurrencyInstance(india);
		
		// Format payment with instance
		System.out.println("US: " + u.format(payment));
		System.out.println("India: " + i.format(payment));
		System.out.println("China: " + c.format(payment));
		System.out.println("France: " + f.format(payment));
	}
}