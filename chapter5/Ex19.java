import java.util.Scanner; 

public class Ex19{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the three sides of a triangle: " );
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
	
		if(isValid(a,b,c)) System.out.println("Area: "+computeArea(a,b,c));
		else System.out.println("Invalid entry.");
	}
	
	public static boolean isValid(double a,double b,double c) {
		if ((a>b+c) || (b>a+c) || (c>a+b))
			return false;
		else 
			return true;
	}
	
	public static double computeArea(double s1,double s2,double s3){
		double s;
		s = (s1+s2+s3)/2.0;
		return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
	}
}
