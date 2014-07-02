import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		double balance, interestRate, interest; 
		
		System.out.println("Enter the balance and the interest rate: ");
		Scanner input = new Scanner(System.in);
		
		balance = input.nextDouble();
		interestRate = input.nextDouble();
		
		interest = balance * (interestRate/1200);
		
		
		System.out.println("Interest is: "+interest);
		
	}
}
