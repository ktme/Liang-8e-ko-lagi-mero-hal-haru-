import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args){
		int number, sum;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 1000 ");
		number = input.nextInt();
		
		sum = number%10;
		number = number/10;
		sum = sum + number%10;
		number = number /10; 
		sum = sum + number%10;
		number = number /10; 
		sum = sum + number%10;
		
		System.out.println("The sum of the digits is "+sum);
		
	}
}

