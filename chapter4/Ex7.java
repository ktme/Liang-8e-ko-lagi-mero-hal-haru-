public class Ex7{
	public static void main(String [] args){
		double principal = 10000; 
		final double rate = 0.05;
		double amount = 0;
		double sum=0;
		int count = 1; 
		System.out.println("Principal amount: "+principal);
		while(count<=13){
			amount = principal + rate * principal;
			principal = amount;
			System.out.printf("After %d year(s), amount: %.2f\n",count,amount);
		
			if(count>=10){
				sum+=amount;
			}
			count++; 
		}
		System.out.printf("The four-year tuition after ten years is %.2f\n",sum);
		
	}
}
