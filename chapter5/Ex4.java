import java.util.Scanner; 

public class Ex4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.println("Reverse: "+reverse(number));
		
	}
	
	public static int reverse(int n){
		int reverse = 0,digit;
		while (n>0){
			digit = n%10; 
			reverse = digit + reverse*10;
			n/=10;
		}
		return reverse;
	}
}
