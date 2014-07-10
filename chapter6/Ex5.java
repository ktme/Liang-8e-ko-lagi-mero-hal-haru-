import java.util.Scanner;
public class Ex5 {
	public static void main(String[] args){
		int[] num = new int[10];
		
		inputNumbers(num);
		displayArray(num);
	}
	public static void inputNumbers(int[] num){
		Scanner input = new Scanner(System.in);
		int number ;
		boolean found = false;
		
		for(int i = 0; i<num.length; i++){
			found = false;
			number = input.nextInt();
			for (int j = 0; j<=i ;j++){
				if(number==num[j]) {
					found = true;
					break;
				}
			}
			if(!found)
				num[i] = number;
		}
	}
	public static void displayArray(int[] num){
		for(int i = 0; i<num.length; i++){
			if(num[i]!=0) System.out.print(num[i]+ " ");
		}
	}
}
