import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args){
		double subtotal, gRate, gratuity, total=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the subtotal and the gratuity rate: ");
		subtotal = input.nextDouble();
		gRate = input.nextDouble();
		
		gratuity = subtotal*gRate/100.0;
		total = subtotal + gratuity;
		
		System.out.println("The gratuity is "+gratuity+" and total is "+total);
	}
}

