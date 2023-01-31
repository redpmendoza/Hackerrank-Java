import java.util.*;

public class JavaArraylist{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get n
		int n = in.nextInt();
		
		// Create arraylist
		ArrayList arrlist[] = new ArrayList[n];
		
		// Loop n times
		for(int ctr = 0; ctr < n; ctr++){
			
			// Get d
			int d = in.nextInt();
			
			// Create row
			arrlist[ctr] = new ArrayList();
			
			// Get values per row
			for(int ctr2 = 0; ctr2 < d; ctr2++){
				arrlist[ctr].add(in.nextInt());
			}
		}
		
		// Get q
		int q = in.nextInt();
		
		// Loop q times
		for(int ctr = 0; ctr < q; ctr++){
		
			// Get x and y
			int x = in.nextInt();
			int y = in.nextInt();
			
			// Try output value by x and y location
			try{
				System.out.println(arrlist[x-1].get(y-1));
			}
			catch(Exception e){
				System.out.println("ERROR!");
			}
		}
	}
}