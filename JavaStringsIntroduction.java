import java.util.Scanner;

public class JavaStringsIntroduction{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get a and b
		String A = in.nextLine();
		String B = in.nextLine();
		
		// Output length of a and b
		System.out.println(A.length() + B.length());
		
		// Compare a and b
		System.out.println(A.compareTo(B) > 0? "Yes":"No");
		
		// Output capitalized first character of a and b
		System.out.println((A.charAt(0) + "").toUpperCase() + A.substring(1, A.length()) + " " + (B.charAt(0) + "").toUpperCase() + B.substring(1, B.length()));
	}
}