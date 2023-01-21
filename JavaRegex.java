import java.util.*;

public class JavaRegex{
	
	// Constructor
	public JavaRegex(){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Loop to get input
		while(in.hasNext()){
			
			// Get input to check
			String ip = in.nextLine();
			
			// Create object of private class
			MyRegex mr = new MyRegex();
			
			// Output result
			System.out.println(mr.checkIp(ip));
		}
	}
	
	// MyRegex private class
	private class MyRegex{
		
		// checkIp method
		boolean checkIp(String ip){
			
			// Create pattern
			String base = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
			String pattern = base + "\\." + base + "\\." + base + "\\." + base;
			
			// Return result of matching input with pattern
			return ip.matches(pattern);	
		}
	}
	
	// Main method
	public static void main(String[]args){
		
		// Reference class
		new JavaRegex();
	}
}