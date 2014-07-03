import java.util.Scanner; 

public class Ex3 {
	public static void main(String [] args){
		double a,b,c,d,e,f; // ax + by = e, cx + dy = f
		double x, y; //solution
		Scanner input = new Scanner (System.in); 
		
		a = input.nextDouble(); b = input.nextDouble(); c = input.nextDouble();
		d = input.nextDouble(); e = input.nextDouble(); f = input.nextDouble();
		
		if ((a*d-b*c) !=0) { 
			x = (e*d-b*f)/(a*d-b*c);
			y = (a*f-e*c)/(a*d-b*c);
			System.out.println("x: "+x+" y: "+y);
		}
		else 
			System.out.println("This system has no solutions.");
		
	}
}
