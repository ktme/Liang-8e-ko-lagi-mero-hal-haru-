
public class Ex15{
	public static void main(String[] args) {
		double principal = 100; 
		final double iRate =0.00417;
		
		double amount = principal*(1+iRate);  // after month 1
		System.out.println("Value after 1st month: $"+amount);
		
		amount = (principal+amount)*(1+iRate);  
		System.out.println("Value after 2nd month: $"+amount);
		
		amount = (principal+amount)*(1+iRate) ; 
		System.out.println("Value after 3rd months: $"+amount);
		
		amount = (principal+amount)*(1+iRate) ; 
		System.out.println("Value after 4th month: $"+amount);
		
		amount = (principal+amount)*(1+iRate) ;
		System.out.println("Value after 5th month: $"+amount);
		
		amount = (principal+amount)*(1+iRate) ;
		System.out.println("Value after 6 months: $"+amount);
	}
}

