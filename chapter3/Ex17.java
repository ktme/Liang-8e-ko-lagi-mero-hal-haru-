import java.util.Scanner;
public class Ex17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rps = (int) (Math.random()*3); //rock, paper, or scissor
		int guess; 
		
		System.out.println("scissor(0) rock(1) paper(2): ");
		guess = input.nextInt();
		
		if( guess == 0){
			if (rps == 1)
				System.out.println("The computer is rock. You are scissor. You lose.");
			else if (rps == 2)
				System.out.println("The computer is paper. You are scissor. You win.");
			else
				System.out.println("The computer is scissor. You are scissor. Draw.");
		}
		
		else if( guess == 1){
			if (rps == 1)
				System.out.println("The computer is rock. You are rock. Draw.");
			else if (rps == 2)
				System.out.println("The computer is paper. You are rock. You lose.");
			else
				System.out.println("The computer is scissor. You are rock. You win.");
		}
		else {
			if (rps == 1)
				System.out.println("The computer is rock. You are paper. You win.");
			else if (rps == 2)
				System.out.println("The computer is paper. You are paper. Draw.");
			else
				System.out.println("The computer is scissor. You are paper. You lose.");
		}
			
		
	}
}
