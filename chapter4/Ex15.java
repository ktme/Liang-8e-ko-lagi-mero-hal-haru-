import java.util.Scanner; 

public class Ex15 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		int n1,n2,d = 0,gcd = 0; 
		n1 = input.nextInt();
		n2 = input.nextInt();
		
		if(n1<n2) d = n1;
		else if (n1>n2) d = n2; 
		else{
			gcd = n1;
		}
		while (d >= 1 && gcd !=n1) {
			if((n1%d==0) && (n2%d==0)) {
				gcd = d;
				break;
			}
			d--;
		}
		System.out.println("GCD: "+gcd);
	}
}
