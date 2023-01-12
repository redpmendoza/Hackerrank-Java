import java.util.*;

public class JavaDateAndTime{
	
	// Constructor
	public JavaDateAndTime(){
		
		// Create scanner
		Scanner in = new Scanner(System.in);
		
		// Get month, date, and year
		int month = in.nextInt();
		int date = in.nextInt();
		int year = in.nextInt();

		// Pass input to method findDay
		String day = findDay(month, date, year);
		
		// Output day
		System.out.println(day);
	}
	
	// findDay method
	public String findDay(int m, int d, int y){
		
		// Set calendar date
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, m-1);
		c.set(Calendar.DAY_OF_MONTH, d);
		c.set(Calendar.YEAR, y);
		
		// Get day
		String day = c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
		
		// Return day
		return day;
	}
	
	// Main method
	public static void main(String[]args){
		
		// Reference class
		new JavaDateAndTime();
	}
}