import java.util.Scanner;

public class JavaSubstring{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get s
		String s = in.nextLine();
		
		// Get start and end
		int start = in.nextInt();
		int end = in.nextInt();
		
		// Output substring of s
		System.out.println(s.substring(start, end));
	}
}