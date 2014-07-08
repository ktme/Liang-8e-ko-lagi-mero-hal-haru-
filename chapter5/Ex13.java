public class Ex13{
	public static void main(String [] args) {
		System.out.println("i\t\t\tm(i)");
		
		for (int i = 1; i <= 20; i++) 	
			System.out.printf("%d\t\t\t%6.4f\n",i,m(i));
		
	}
	public static double m(int i) {
		double sum = 0;
		for (int j = 1; j <= i; j++ ){
			sum+= (double)j/(j+1);
		}
		return sum;
	}
} 
