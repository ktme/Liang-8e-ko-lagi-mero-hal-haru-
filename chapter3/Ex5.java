import java.util.Scanner; 

public class Ex5 {
	public static void main (String[] args){
		int num1, num2,num3, ans;
		Scanner input = new Scanner(System.in);
		
		num1 = (int)(Math.random()*10);
		num2 = (int)(Math.random()*10);
		num3 = (int)(Math.random()*10);
		
		System.out.println("What is "+num1+" + "+num2+" + " + num3+ " equal to?" );
		ans = input.nextInt();
		
		if (ans == num1+num2+num3) System.out.println("You are right!");
		else System.out.println("Wrong. You're answer is incorrect");
	}
	
}
