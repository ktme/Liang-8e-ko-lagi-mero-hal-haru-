import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args){
		String name; 
		int hours; 
		// hourly payrate, the fed and state tax rate
		double payRate, fTaxRate, sTaxRate; 
		double fDeduct, sDeduct,tDeduct;
		double grossPay,netPay;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee's name: ");
		name = input.next();
		
		System.out.println("Enter number of hours worked in a week: ");
		hours = input.nextInt();
		
		System.out.println("Enter hourly pay rate: ");
		payRate = input.nextDouble();
		
		System.out.println("Enter federal tax withholding rate: ");
		fTaxRate = input.nextDouble();
		
		System.out.println("Enter state tax withholding rate: ");
		sTaxRate = input.nextDouble();
		
		grossPay = (hours*payRate);
		
		fDeduct = (fTaxRate*hours*payRate);
		sDeduct = (sTaxRate*hours*payRate);
		tDeduct = fDeduct+sDeduct;
		
		netPay = grossPay - tDeduct;
		
		System.out.println("Employee name: "+name);
		System.out.println("Hours worked: "+hours);
		System.out.println("Pay rate: $"+payRate);
		System.out.println("Gross pay: $"+grossPay);
		System.out.println("Deductions");
		System.out.println("\tFederal Withholding (" + fTaxRate*100+
		"%): $"+fDeduct);
		System.out.println("\tState Withholding (" + sTaxRate*100+
		"%): $"+sDeduct);
		System.out.println("\tTotal Deduction: $"+(tDeduct));
		System.out.println("Net Pay: $"+(netPay));
	}
}
