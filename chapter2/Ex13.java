import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		double investmentAmount, monthlyInterestRate;
		double fututreInvestmentValue; 
		int numberOfYears;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter investment amount: ");
		investmentAmount = input.nextDouble();
		
		System.out.println("Enter monthly investment rate: ");
		monthlyInterestRate = input.nextDouble()/100.0;
		
		System.out.println("Enter number of years");
		numberOfYears = input.nextInt();
		
		fututreInvestmentValue = investmentAmount * Math.pow((1+monthlyInterestRate),numberOfYears*12);
		
		
		System.out.println("Accumulated value is: "+ fututreInvestmentValue);
		
	}
}
