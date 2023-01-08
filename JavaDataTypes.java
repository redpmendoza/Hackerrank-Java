import java.util.Scanner;

public class JavaDataTypes{
	
	public static void main(String[]args){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get t
		int t = in.nextInt();
		in.nextLine();
		
		// Loop depending on t
		for(int ctr = 0; ctr < t; ctr++){
			
			// Get n
			String n = in.nextLine();
			
			// Create checker variables
			int b = 0, s = 0, i = 0, l = 0;
			
			// Check if n can be byte
			try{
				byte a = Byte.parseByte(n);
				b = 1;
			}
			catch(Exception e){}
			
			// Check if n can be short
			try{
				short a = Short.parseShort(n);
				s = 1;
			}
			catch(Exception e){}
			
			// Check if n can be int
			try{
				int a = Integer.parseInt(n);
				i = 1;
			}
			catch(Exception e){}
			
			// Check if n can be long
			try{
				long a = Long.parseLong(n);
				l = 1;
			}
			catch(Exception e){}

			// Check if n can be fitted in the four data types
			if(b == 0 && s == 0 && i == 0 && l == 0){
				
				// Output cannot be fitted
				System.out.println(n + " can't be fitted anywhere.");
			}
			else{
				
				// Output can be fitted
				System.out.println(n + " can be fitted in:");
				
				// Output for byte
				if(b == 1){
					System.out.println("* byte");
				}
				
				// Output for short
				if(s == 1){
					System.out.println("* short");
				}
				
				// Output for int
				if(i == 1){
					System.out.println("* int");
				}
				
				// Output for long
				if(l == 1){
					System.out.println("* long");
				}
			}		
		}
	}
}