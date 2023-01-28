import java.util.Scanner;

public class Java1DArray{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get n
		int n = in.nextInt();
		
		// Create a
		int a[] = new int[n];
		
		// Get a
		for(int ctr = 0; ctr <  n; ctr++){
			a[ctr] = in.nextInt();
		}
		
		// Output a
		for(int ctr = 0; ctr < n; ctr++){
			System.out.println(a[ctr]);
		}
	}
}