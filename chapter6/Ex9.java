import java.util.Scanner;
public class Ex9{
	public static void main(String[] args){
		int[] num = new int[10];
		inputNumbers(num);
		System.out.println("min: "+min(num));
	}
	public static void inputNumbers(int[] num){
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<num.length; i++){
			num[i] = input.nextInt();
		}
	}
	
	
	public static int min(int[] num){
		int m = 100000;
		for(int i = 0; i<num.length; i++){
			if(num[i]<m) m = num[i];
		}
		return m;
	}
}
