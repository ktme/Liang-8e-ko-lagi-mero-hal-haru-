import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args){
		double radius, length, area, volume;
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radius and length of the cylinder");
		radius = input.nextDouble();
		length = input.nextDouble();
		
		area = radius * radius * PI;
		volume = area * length;
		
		System.out.println("Area is "+area);
		System.out.println("Volume is "+volume);
		
		
	}
}

