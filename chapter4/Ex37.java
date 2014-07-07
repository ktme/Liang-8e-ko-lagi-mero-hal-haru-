import java.util.Scanner;

public class Ex37 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal integer: ");
		int number = input.nextInt(); 
		int digit, binary = 0;
		int i = 0;
		while(number > 0){
			digit = number%2; //extract 0 or 1 
			number /= 2;       
			binary = (int)(Math.pow(10, i)) * digit + binary;
			i++;			
		}
		
		System.out.println("Binary: "+binary);
		
		
		
	}
}
