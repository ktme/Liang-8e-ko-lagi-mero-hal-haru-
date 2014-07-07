import java.util.Scanner;

public class Ex36 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 9 digit integer: ");
		int number = input.nextInt();
		int copy = number;
		int digit,checksum,sum=0; 
		
		for (int i = 9; i>=1; i--){
			digit = number%10;
			sum += digit*i;  
			number/=10;
		}
		
		checksum = sum%11;
		
		if (checksum == 10)
			System.out.println("ISBN: "+copy+"X");
		else 
			System.out.println("ISBN: "+copy+checksum);
		
	}
}
