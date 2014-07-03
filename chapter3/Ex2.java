import java.util.Scanner; 

public class Ex2 {
	public static void main (String[] args){
		int number;
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt(); 
		
		if (number%2==0) System.out.println("The number is even.");
		else System.out.println("The number is not even.");
		
	}
}
