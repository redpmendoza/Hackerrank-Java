import java.util.Scanner;

public class Java2DArray{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Create array
		int arr[][] = new int[6][6];
		
		// Get values to store in array
		for(int ctr = 0; ctr < 6; ctr++){
			for(int ctr2 = 0; ctr2 < 6; ctr2++){
				arr[ctr][ctr2] = in.nextInt();
			}
		}
		
		// Create variable to store max sum
		int max = 0-63;
		
		// Get max sum
		for(int ctr = 0; ctr <= 3; ctr++){
			for(int ctr2 = 0; ctr2 <= 3; ctr2++){
				int sum = arr[ctr][ctr2] + arr[ctr][ctr2+1] + arr[ctr][ctr2+2] + arr[ctr+1][ctr2+1] +
					arr[ctr+2][ctr2] + arr[ctr+2][ctr2+1] + arr[ctr+2][ctr2+2];
				
				if(sum > max){
					max = sum;
				}	
			}
		}
		
		// Output max sum
		System.out.println(max);
	}
}