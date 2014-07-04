import java.util.Scanner; 

public class Ex26 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		boolean value = false;
		System.out.println("Enter an integer: ");
		int num = input.nextInt();
		value = ((num%5 == 0 ) && (num%6 ==0));
		System.out.println(num+" is divisible by both 5 and 6:" + value);
		value = ((num %5 == 0) || (num%6 == 0));
		System.out.println(num+" is divisible by either 5 or 6:"+ value);
		
		value = (num %5 == 0) ^ (num%6 == 0); // same as (num %5 == 0) || (num%6 == 0)) && !((num%5 == 0 ) && (num%6 ==0));
		System.out.println(num+" is divisible by either 5 or 6, but not both:"+ value);
	}
}
