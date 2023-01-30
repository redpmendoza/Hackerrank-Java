import java.util.Scanner;

public class JavaSubarray{
	
	public static void main(String[]args){
			
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get n
		int n = in.nextInt();
		
		// Create array
		int A[] = new int[n];
		
		// Get values to store in array
		for(int ctr = 0; ctr < n; ctr++){
			A[ctr] = in.nextInt();
		}
		
		// Create counter variable
		int count = 0;
		
		// Get sub array with negative sum
		for(int ctr = 0; ctr < n; ctr++){
			int sum = 0;
			for(int ctr2 = ctr; ctr2 < n; ctr2++){
				sum = A[ctr2] + sum;
				
				if(sum < 0){
					count++;
				}
			}
		}
		
		// Output count of sub array with negative sum
		System.out.println(count);
	}
}