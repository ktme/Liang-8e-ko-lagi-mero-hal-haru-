import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args){
		double feet, meters;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value for feet: ");
		feet = input.nextDouble();
		
		meters = feet*0.305;
		
		System.out.println(feet + " feet is " + meters + " meters");
		
		
	}
}

