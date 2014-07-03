import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args){
		double ivelocity, fvelocity, time; //initial and final velocity
		double acceleration;
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the initial velocity, the final velocity and time: ");
		
		ivelocity = input.nextDouble();
		fvelocity = input.nextDouble(); 
		time = input.nextDouble();
		
		acceleration = (fvelocity-ivelocity)/time;
		
		System.out.println("The average velocity is: "+ acceleration);
	}
	
}
