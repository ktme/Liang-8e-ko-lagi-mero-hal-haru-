import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args){
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter and ASCII code:");
		number = input.nextInt();
		
		System.out.println("The character for ASCII code "
		+number+ " is "+(char)number);
	}
}

