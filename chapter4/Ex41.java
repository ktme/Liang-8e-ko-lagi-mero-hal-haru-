import java.util.Scanner; 

public class Ex41{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int max = 0, count = 0;
		int number ;
		
		while ((number = input.nextInt()) != 0){
			if (number > max){
				max = number; 
				count = 1;
			}
			else if (number == max) {
				count++;
			}
		}
		
		System.out.println("Max: "+max);
		System.out.println("Freq: "+count);
	}
}
