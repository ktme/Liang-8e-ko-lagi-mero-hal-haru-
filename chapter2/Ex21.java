import java.util.Scanner; 
public class Ex21 {
	public static void main(String[] args) {
		double x1,y1,x2,y2,x3,y3; //points
		double s1,s2,s3,s, area; // sides 1,2,3 and s - the semi-perimeter
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter x1 and y1");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		
		System.out.println("Enter x2 and y2");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		System.out.println("Enter x3 and y3");
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		
		s1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		s2 = Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
		s3 = Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
		
		s = (s1+s2+s3)/2.0;
		
		area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		System.out.println("Area: " + area);
	}
}
