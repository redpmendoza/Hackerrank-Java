import java.util.Scanner;
import java.util.regex.*;

public class TagContentExtractor{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get n
		int N = Integer.parseInt(in.nextLine());
		
		// Create pattern
		String base = "<([^<>]+)>([^<>]+)</\\1>";
		Pattern patt = Pattern.compile(base);

		// Loop n times
		for(int ctr = 0; ctr < N; ctr++){
			
			// Get input
			String input = in.nextLine();
			
			// Match input with pattern
			Matcher mtchr = patt.matcher(input);
			
			// Create counter variable
			int count = 0;
			
			// Find match
			while(mtchr.find()){
				System.out.println(mtchr.group(2));
				count++;
			}
			
			// Output none
			if(count == 0){
				System.out.println("None");
			}
		}
	}
}