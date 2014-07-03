import java.util.Scanner;

public class Ex24 {
	public static void main(String[] args){
		double v, a, length; // v- velocity, a-acceleration
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the velocity, the acceleration: ");
		
		v = input.nextDouble();
		a = input.nextDouble();
		
		length = Math.pow(v,2)/(2*a);
		
		System.out.println("The minimum runway length is: "+length);
		
	}
	
}
