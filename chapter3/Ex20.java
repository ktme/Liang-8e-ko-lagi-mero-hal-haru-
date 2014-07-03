import java.util.Scanner; 
public class Ex20 {
	public static void main(String[] args) {
		double windChill; // final and initial temperatures in celsius
		double velocity, temp;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the temperature in fahrenheit (-58 to 41 ): ");
		temp = input.nextDouble();

		System.out.println("Enter the wind velocity in mph (>=2): ");
		velocity = input.nextDouble();
		if ((temp>=-58 && temp<= 41) && velocity >=2) {
			windChill = 35.74 + 0.6215*temp - 35.74* Math.pow(velocity,0.16)
			+0.4275*temp*Math.pow(velocity,0.16);
			
			System.out.println("Wind Chill Index: "+windChill);
		}
		else {
			System.out.println("Something went wrong.");
			if(!(velocity>=2)) System.out.println("Velocity is smaller than 2");
			if(!(temp>=-58 && temp<= 41)) System.out.println("Temperature is out of range.");
		}
	}
}
