import java.util.Scanner; 

public class Ex21{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double rate = 5, monthly, total; 
		
		
		System.out.print("Loam Amount: ");
		double amt = input.nextDouble(); 
		System.out.print("Number of years: ");
		int years = input.nextInt();
		
		System.out.println("Interest Rate\t\tMonthly Payment\t\tTotal Payment");
		
		for (; rate <=8 ; rate+=0.125){
			monthly = (amt*rate/1200)/(1-(1/Math.pow(1+rate/1200,5*12)));
			total = monthly*years*12;
			System.out.printf("%.3f%%\t\t\t%.2f\t\t\t%.2f\n",rate,monthly,total);
		}
	}
}
