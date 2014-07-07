public class Ex25{
	public static void main(String[] args){
		 
		double pi=0; 
		double sum = 0;
		int count;
		for (int i = 10000 ; i<=100000; i+=10000){
			count = 2;
			sum = 0; 
			for (int j = 1; j <= 2*i+1; j+=2){
				sum = Math.pow(-1,count)*1.0d/j + sum;
				count++;   
			}
			pi = sum*4;
			System.out.println("For i = " + i+ " Pi: " + pi);
		}
		
		
		
	}
}
