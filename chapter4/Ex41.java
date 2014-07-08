import java.util.Scanner; 

public class Ex41{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int max = 0, count = 0;                  // maximum and frequency of maximum
		int number ;                   
		
		while ((number = input.nextInt()) != 0){
			if (number > max){
				max = number; 
				count = 1;               // set count to 1 when a new max is found
			}
			else if (number == max) {
				count++;                // if there's another max, increment count
			}
		}
		
		System.out.println("Max: "+max);
		System.out.println("Freq: "+count);
	}
}
