import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args){
		int[] num = new int[10];
		
		inputNumbers(num);
		analyzeArray(num);
	}
	public static void inputNumbers(int[] num){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int i = 0;
		while (!(number<0) && i<10){
			num[i] = number;
			number = input.nextInt();
			i++; 
		}
	}
	
	public static void analyzeArray(int[] num){
		int i = 0, sum = 0;
		int count = 0;
		while (i<10){
			if(num[i]!=0){
				count++;
				sum += num[i]; 
			}
			i++; 
		}
		System.out.println("Sum: "+sum);
		
		System.out.printf("Average: %.1f\n",(double)sum/count);
	}
	
}
