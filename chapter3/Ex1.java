import java.util.Scanner; 

public class Ex1 {
	public static void main(String[] args) { 
		//solve quadratic
		double a, b, c; // ax^2+bx+c = 0
		double discriminant; 
		double r1,r2; //roots 1 and 2 
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter values for a, b and c: ");
		a = input.nextDouble(); 
		b = input.nextDouble(); 
		c = input.nextDouble();
		
		discriminant =(Math.pow(b,2)-4*a*c);
		
		if (discriminant > 0){
			discriminant = Math.sqrt(Math.pow(b,2)-4*a*c);
			r1 = (-b + discriminant)/(2*a); 
			r2 = (-b - discriminant)/(2*a); 
		
			System.out.println("r1: "+r1);
			System.out.println("r2: "+r2);
		}
		else if (discriminant == 0){
			discriminant = Math.sqrt(Math.pow(b,2)-4*a*c);
			r1 = (-b + discriminant)/(2*a); 
		
			System.out.println("root: "+r1);
		}
		else 
			System.out.println("No real roots.");
	}
}
