import java.util.Scanner;
public class Ex7 {
	public static void main(String[] args){
		int[] num = new int[100];
		int[] count = new int[10];
		
		inputNumbers(num);
		displayArray(num);
		
		countElements(count,num);
		System.out.println("\n\nCount for numbers 0 - 9: ");
		displayArray(count);
	}
	public static void inputNumbers(int[] num){
		for(int i = 0; i<num.length; i++){
			num[i] = (int) (Math.random()*10);
		}
	}
	public static void countElements(int[] count, int[] num){
		for (int i = 0; i< num.length; i++)
			count[num[i]]++;
	}
	public static void displayArray(int[] num){
		for(int i = 0; i<num.length; i++){
			if((i+1)%10==0)
				System.out.println(num[i]+"\t");
			else 
				System.out.print(num[i]+"\t");
		}
	}
}
