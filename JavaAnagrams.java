import java.util.*;

public class JavaAnagrams{
	
	// Constructor
	public JavaAnagrams(){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get a and b
		String a = in.nextLine().toLowerCase();
		String b = in.nextLine().toLowerCase();
		
		// Output if anagram or not
		System.out.println(isAnagram(a, b));
	}
	
	// isAnagram method
	public String isAnagram(String a, String b){
		
		// Create array of alphabets
		String alpha[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i",
		"j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
		"x", "y", "z"};
		
		// Create counter arrays
		int count1[] = new int[26];
		int count2[] = new int[26];
		
		// Fill counter arrays with zero
		Arrays.fill(count1, 0);
		Arrays.fill(count2, 0);
		
		// Check if a and b has the same length
		if(a.length() != b.length()){
			return "Not Anagrams";
		}
		else{
			
			// Add to counter per alphabet
			for(int ctr = 0; ctr < a.length(); ctr++){
				for(int ctr2 = 0; ctr2 < 25; ctr2++){
					if((a.charAt(ctr) + "").equals(alpha[ctr2])){
						count1[ctr2]++;
					}
					if((b.charAt(ctr) + "").equals(alpha[ctr2])){
						count2[ctr2]++;
					}			
				}
			}
			
			// Check if counter arrays are the same
			for(int ctr = 0; ctr < 25; ctr++){
				if(count1[ctr] != count2[ctr]){
					return "Not Anagrams";
				}
			}
			
			// Return anagrams
			return "Anagrams";
		}
		
	}
	
	// Main method
	public static void main(String[]args){
		
		// Reference class
		new JavaAnagrams();
	}
}