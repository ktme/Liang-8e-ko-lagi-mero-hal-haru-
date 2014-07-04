import java.util.Scanner; 
public class Ex22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x,y ;
		double dist_origin; 
		
		System.out.print("Enter the x and y coordinates: ");
		x = input.nextDouble();
		y = input.nextDouble(); 
		//circle centered at 0,0 with radius = 10
		dist_origin = Math.sqrt(x*x+y*y);
		
		if(dist_origin <= 10) System.out.println("Point is inside the circle.");
		else System.out.println("Point is not inside the circle.");
	}
}
