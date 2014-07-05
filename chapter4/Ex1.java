import java.util.Scanner; 

public class Ex1 {
	public static void main (String[] args){
		int number;
		int positives =0, negatives = 0, total = 0, count = 0 ; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an int value, the program exits if you enter a 0: ");
		number = input.nextInt(); 
		
		while(number!=0){
			count++; 
			if(number > 0) positives++; 
			else negatives++; 
			
			total += number;  
			System.out.print("Enter an int value, the program exits if you enter a 0: ");
			number = input.nextInt(); 
		}
		System.out.println("The number of positives is: " + positives);
		System.out.println("The number of negatives is: " + negatives);
		System.out.println("Total: " + total);
		System.out.println("Average: " + (double)total/count);
		
		

	}
}
