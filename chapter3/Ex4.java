import java.util.Scanner; 

public class Ex4 {
	public static void main (String[] args){
		int num1, num2, ans;
		Scanner input = new Scanner(System.in);
		num1 = (int)(Math.random()*100);
		num2 = (int)(Math.random()*100);
		System.out.println("What is "+num1+" + "+num2+" equal to?" );
		ans = input.nextInt();
		
		if (ans == num1+num2) System.out.println("You are right!");
		else System.out.println("Wrong. You're answer is incorrect");
	}
	
}
