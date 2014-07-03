import java.util.Scanner; 

public class Ex9 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int d1,d2,d3,d4,d5,d6,d7,d8,d9,number ; // my three numbers
		int checksum; 
		
		System.out.println("Enter a 9-digit integers: ");
		number = input.nextInt();
		
		d9 = number%10; number /= 10; 
		d8 = number%10; number /= 10; 
		d7 = number%10; number /= 10; 
		d6 = number%10; number /= 10; 
		d5 = number%10; number /= 10; 
		d4 = number%10; number /= 10; 
		d3 = number%10; number /= 10; 
		d2 = number%10; 
		d1 = number/10; 
		
		checksum = (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
		if (checksum == 10)
			System.out.println("ISBN: "+d1+d2+d3+d4+d5+d6+d7+d8+d9+"X");
		else 
			System.out.println("ISBN: "+d1+d2+d3+d4+d5+d6+d7+d8+d9+checksum);
	}
}
