import java.util.Scanner; 
public class Ex20 {
	public static void main(String[] args) {
		double x1,y1,x2,y2; 
		double distance;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter x1 and y1");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		
		System.out.println("Enter x2 and y2");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("Distance: "+distance);
	}
}
