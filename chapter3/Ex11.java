import java.util.Scanner; 

public class Ex11 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int month, year; 
		boolean isLeap = false;
		System.out.println("Enter the month(1-12) and year: ");
		
		month = input.nextInt(); 
		year = input.nextInt(); 
		
		if((year%4==0 && year%100!=0 )|| (year%400 == 0)) isLeap = true;
		else isLeap = false; 
		
		if (month == 1) System.out.println("Month: January, Number of days: "+31);
		else if (month == 2) {
				if(!isLeap) System.out.println("Month: February, Number of days: "+28); 
				else System.out.println("Month: February, Number of days: "+29); 
		}
		else if (month == 3) System.out.println("Month: March, Number of days: "+31);
		else if (month == 4) System.out.println("Month: April, Number of days: "+30);
		else if (month == 5) System.out.println("Month: May, Number of days: "+31);
		else if (month == 6) System.out.println("Month: June, Number of days: "+30);
		else if (month == 7) System.out.println("Month: July, Number of days: "+31);
		else if (month == 8) System.out.println("Month: August, Number of days: "+31);
		else if (month == 9) System.out.println("Month: September, Number of days: "+30);
		else if (month == 10) System.out.println("Month: October, Number of days: "+31);
		else if (month == 11) System.out.println("Month: November, Number of days: "+30);
		else if (month == 12) System.out.println("Month: December, Number of days: "+31);
		else 
		System.out.println("Wrong entry"); 
		
	}
	
}
