import java.util.Scanner; 
public class Ex21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double year, month, dayMonth; // year, month and day of the month
		double century, yearCentury;
		int  dayWeek;
		
		System.out.println("Enter year: ");
		year = input.nextDouble();
		
		System.out.println("Enter month: ");
		month = input.nextDouble();
		
		System.out.println("Enter day of the month : ");
		dayMonth = input.nextDouble();
		
		if (month == 1) {
			month = 13; 
			year = year-1;
		}
		
		if (month == 2){
			month = 14; 
			year = year-1;
		}
		
		century = year/100;
		yearCentury = year%100; //book says year%7 but that is clearly wrong
		
		dayWeek = ((int)(dayMonth + (int)((26*(month+1))/10) + yearCentury +  
					(int)(yearCentury/4) + (int)(century/4) + 5*century))%7;
					
		System.out.println("Day of the week is: "+dayWeek);
	}
}
