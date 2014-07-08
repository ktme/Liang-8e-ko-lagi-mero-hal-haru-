import java.util.Scanner; 

public class Ex5 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		displaySorted(num1,num2,num3);
		
	}
	 //assume 3 distinct numbers are passed 
	public static void displaySorted(double num1, double num2, double num3){
		if (num1<num2 && num1<num3){
			System.out.print(num1+" < ");
			if (num2<num3) System.out.print(num2+" < "+num3);
			else System.out.print(num3+" < "+num2);
		}  
		else if(num2<num1 && num2< num3){
			System.out.print(num2+" < ");
			if(num1<num3) System.out.print(num1+" < "+num3);
			else System.out.print(num3+" < "+num1);
		}
		else {
			System.out.print(num3+" < ");
			if(num1<num2) System.out.print(num1+" < "+num2);
			else System.out.print(num2+" < "+num1);
		}
	}
}
