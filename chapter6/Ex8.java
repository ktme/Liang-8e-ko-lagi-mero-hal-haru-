import java.util.Scanner;
public class Ex8{
	public static void main(String[] args){
		int[] num = new int[10];
		double[] num2 = new double[10];
		inputNumbers(num,num2);
		System.out.println("Average(int): "+average(num));
		System.out.println("Average(int): "+average(num2));
	}
	public static void inputNumbers(int[] num, double[] num2){
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i<num.length; i++){
			num[i] = input.nextInt();
			num2[i] = num[i];
		}
	}
	
	public static void displayArray(int[] num){
		for(int i = 0; i<num.length; i++){
			if((i+1)%10==0)
				System.out.println(num[i]+"\t");
			else 
				System.out.print(num[i]+"\t");
		}
	}
	
	public static int average(int[] num){
		int sum = 0;
		for(int i = 0; i<num.length; i++){
			sum+=num[i];
		}
		return sum/num.length;
	}
	
	public static double average(double[] num){
		int sum = 0;
		for(int i = 0; i<num.length; i++){
			sum+=num[i];
		}
		return (double)sum/num.length;
	}
}
