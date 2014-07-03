import java.util.Scanner; 
public class Ex16{
	public static void main(String[] args) {
		double finTemp, initTemp; // final and initial temperatures in celsius
		double kgs, energy;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in kgs: ");
		kgs = input.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		initTemp = input.nextDouble();
		
		System.out.println("Enter the finaltemperature: ");
		finTemp = input.nextDouble();
		
		energy = kgs*(finTemp-initTemp)*4184;
		System.out.println("The energy needed is: "+energy);	
	}
}


