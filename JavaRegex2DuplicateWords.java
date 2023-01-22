import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class JavaRegex2DuplicateWords{
	
	public static void main(String[]args){
	
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get n
		int n = Integer.parseInt(in.nextLine());
		
		// Create pattern
		String base = "\\b(\\w+)(?:\\W+\\1\\b)+";
		Pattern patt = Pattern.compile(base, Pattern.CASE_INSENSITIVE);	
		
		// Loop until n
		for(int ctr = 0; ctr < n; ctr++){
			
			// Get input
			String input = in.nextLine();
			
			// Match to input
			Matcher mtch = patt.matcher(input);
			
			// Loop to replace all match
			while(mtch.find()){
				input = input.replaceAll(mtch.group(), mtch.group(1));
			}
			
			// Output input without match
			System.out.println(input);
		}
	}
}
