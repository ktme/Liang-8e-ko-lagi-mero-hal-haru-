import java.util.Scanner; 
public class Ex17 {
	public static void main(String[] args) {
		double windChill; // final and initial temperatures in celsius
		double velocity, temp;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in fahrenheit: ");
		temp = input.nextDouble();
		
		System.out.println("Enter the wind velocity in mph: ");
		velocity = input.nextDouble();
		
		windChill = 35.74 + 0.6215*temp - 35.74* Math.pow(velocity,0.16)
		+0.4275*temp*Math.pow(velocity,0.16);
		
		System.out.println("Wind Chill Index: "+windChill);
		
		
			
	}
}


