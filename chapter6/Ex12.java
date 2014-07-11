import java.util.Scanner;
public class Ex12{
	public static void main(String[] args){
		int[] num = new int[10];
		inputNumbers(num);
		reverse(num);
		displayArray(num);
	}
	public static void inputNumbers(int[] num){
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<num.length; i++){
			num[i] = input.nextInt();
		}
	}
	
	public static void displayArray(int[] num){
		for(int i = 0; i<num.length; i++){
			System.out.print(num[i]+"  ");
		}
	}
	
	public static void reverse(int[] num){
		int temp;
		for (int i = 0; i<num.length/2; i++){
			temp = num[i];
			num[i] = num[num.length-i-1];
			num[num.length-i-1] = temp; 
		}
	}
}
