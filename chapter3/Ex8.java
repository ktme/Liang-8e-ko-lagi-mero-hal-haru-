import java.util.Scanner; 

public class Ex8 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int a,b,c ; // my three numbers
		
		System.out.println("Enter three integers: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();  
		
		if(a<b && a < c){
			if (b < c)
				System.out.println(a + " "+b+ " "+c );
			else 
				System.out.println(a + " "+c+ " "+b );
		}
		else if (b<c){
			if (a < c)
				System.out.println(b + " "+a+ " "+c );
			else 
				System.out.println(b + " "+c+ " "+a );
		}
		else {
			if (b < a)
				System.out.println(c + " "+b+ " "+a );
			else 
				System.out.println(c + " "+a+ " "+b );
		}
	}
}
