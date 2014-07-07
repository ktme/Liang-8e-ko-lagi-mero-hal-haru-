import java.util.Scanner; 

public class Ex26{
	public static void main(String[] args){
		double sum=0; 
		long fact ;
		
		Scanner input = new Scanner(System.in);
		final int n = input.nextInt();
		
		for (int i = 1; i <= n; i++){
			fact = 1;
			for (int j = i; j>=1; j--){
				fact = fact * j;
			}
			sum += (double)1/ fact;
		}
		System.out.print("e: "+(sum+1));
	}
}
