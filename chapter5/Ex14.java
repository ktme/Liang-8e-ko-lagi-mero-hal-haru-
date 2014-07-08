public class Ex14{
	public static void main(String [] args) {
		System.out.println("i\t\t\tm(i)");
		
		for (int i = 10; i <= 100; i++) 	
			System.out.printf("%d\t\t\t%6.4f\n",i,m(i));
		
	}
	public static double m(int i) {
		double sum = 0;
		int pow = 2;
		for (int j = 1; j <= 2*i+1; j+=2){
			sum = Math.pow(-1,pow)*1.0d/j + sum;  
			pow++;
		}
		return sum*4;
	}
} 
