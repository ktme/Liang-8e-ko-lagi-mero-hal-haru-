import java.util.Scanner; 

public class Ex14 {
	public static void main (String[] args){
		int guess, ans;
		Scanner input = new Scanner(System.in);
		guess= (int)(Math.random()*100);
		
		System.out.println("Enter 0 or 1: " );
		ans = input.nextInt();

		if (ans == guess) System.out.println("You guessed right!");
		else System.out.println("Wrong. You're answer is incorrect");
	}

}
