import java.util.Scanner; 

public class Ex12 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println("Enter an integer: ");
		if ((num%5 == 0 ) && (num%6 ==0))
			System.out.println(num+" is divisible by both 5 and 6.");
		else if ((num %5 == 0) || (num%6 == 0)) 
			System.out.println(num+" is divisible by either 5 or 6, but not both.");
		else 
			System.out.println(num+" is not divisible by either 5 or 6.");
	}
}
