import java.util.Scanner;
import java.math.*;

public class JavaBigDecimal{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get n
		int n = in.nextInt();
		
		// Create s
		String s[] = new String[n + 2];
		
		// Get s
		for(int i = 0; i < n; i++){
			s[i] = in.next();
		}
		
		// Sort all input in s
		for(int ctr = 1; ctr < n; ctr++){
			for(int ctr2 = ctr; ctr2 >= 1; ctr2--){
				if(new BigDecimal(s[ctr2]).compareTo(new BigDecimal(s[ctr2 - 1])) > 0){
					String temp = s[ctr2];
					s[ctr2] = s[ctr2 - 1];
					s[ctr2 - 1] = temp;
				}
				else{
					break;
				}
			}
		}
		
		// Output s
		for(int ctr = 0; ctr < n; ctr++){
			System.out.println(s[ctr]);
		}
	}
}