import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args){
		int num[] = new int[10];
		
		System.out.print("Enter 10 integers: ");
		inputNumbers(num);
		reverseDisplay(num);
		
	}
	
	public static void inputNumbers(int[] num){
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++){
			num[i]=input.nextInt();
		}
	}
	
	public static void reverseDisplay(int[] num){
		for (int i = num.length-1 ; i>=0 ;i--){
			System.out.print(num[i] + " ");
		}
	}
	
	
}
