import java.util.Scanner; 

public class Ex22 {
	public static void main(String[] args){
		double side, area; 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the side of the hexagon: ");
		side = input.nextDouble();
		
		area = 1.5*Math.sqrt(3)*side*side ; 
		
		System.out.println("The area is: "+area);
	}
} 
