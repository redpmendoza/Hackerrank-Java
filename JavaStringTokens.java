import java.util.*;

public class JavaStringTokens{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get s
		String s = in.nextLine();
		
		// Split s with regex
		String splt[] = s.split("[^a-zA-Z]");

		// Create count and tokens to store store number of tokens and tokens
		int count = 0;
		String tokens = "";
		
		// Add all tokens and increment count
		for(int ctr = 0; ctr < splt.length; ctr++){
			if(splt[ctr].length() > 0){
				count++;
				tokens = tokens + splt[ctr] + "\n";
			}
		}
		
		// Output count and tokens
		System.out.println(count + "\n" + tokens);
	}
}