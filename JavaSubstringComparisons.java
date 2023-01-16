import java.util.*;

public class JavaSubstringComparisons{
	
	// Constructor
	public JavaSubstringComparisons(){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get k and s
		String s = in.nextLine();
		int k = in.nextInt();
		
		// Output smallest and largest substring
		System.out.println(getSmallestAndLargest(s, k));
	}
	
	// getSmallestAndLargest method
	public String getSmallestAndLargest(String s, int k){
		
		// Create a vector
		Vector <String> vec = new Vector();
		
		// Divide string to substrings and store in vector
		for(int ctr = 0; ctr < s.length()-k+1; ctr++){
			vec.add(s.substring(ctr, ctr+k));
		}
		
		// Sort vector
		java.util.Collections.sort(vec);
		
		// Return smallest and largest substring
		return vec.get(0) + "\n" + vec.get(vec.size() - 1);
	}
	
	// Main method
	public static void main(String[]args){
		
		// Reference class
		new JavaSubstringComparisons();
	}
}