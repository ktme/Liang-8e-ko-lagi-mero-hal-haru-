import java.util.Scanner; 

public class Ex8 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int a,b,c ; // my three numbers
		
		System.out.println("Enter three integers: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();  
		
		if (a > b && a > c) 
			System.out.println("Max: "+a);
		else if (b > c)
			System.out.println("Max: "+b);
		else 
			System.out.println("Max: "+c);
	}
}
