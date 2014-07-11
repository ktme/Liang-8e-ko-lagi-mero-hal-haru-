import java.util.Scanner;
public class Ex10{
	public static void main(String[] args){
		int[] num = new int[10];
		inputNumbers(num);
		System.out.println("Index of smallest element: "+indexOfSmallestElement(num));
	}
	public static void inputNumbers(int[] num){
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<num.length; i++){
			num[i] = input.nextInt();
		}
	}
	public static int indexOfSmallestElement(int[] num){
		int m = 100000;
		int index=-1;
		for(int i = 0; i<num.length; i++){
			if(num[i]<m) {
				m = num[i];
				index = i;
			}
		}
		return index;
	}
}
