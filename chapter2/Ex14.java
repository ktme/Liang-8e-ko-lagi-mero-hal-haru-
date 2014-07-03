import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		double weight, height;
		double bmi;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds: ");
		weight = input.nextDouble()*0.454;
		
		System.out.println("Enter height in inches: ");
		height = input.nextDouble()*0.0254;
		
		bmi = weight/(Math.pow(height,2));
		
		System.out.println("BMI is: "+ bmi);	
	}
}

