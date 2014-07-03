import java.util.Scanner; 

public class Ex19 {
	public static void main (String[] args){
		double a, b, c; // a,b, and c represent the three sides of a triangle
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the three sides of a triangle: " );
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		

		if ((a>b+c) || (b>a+c) || (c>a+b))
			System.out.println("Triangle is not possible.");
		else 
			System.out.println("Triangle is possible!");
	}

}
