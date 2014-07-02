import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args){
		int minutes, years, days;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of minutes");
		minutes = input.nextInt();
		
		
		years = minutes/(60*24*365); 
		days = minutes/(60*24)%365;
		System.out.println(minutes + " minutes is approximately "+years
		+" years and "+days+" days" );
		
	}
}

