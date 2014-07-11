import java.util.Scanner;
public class Ex11{
	public static void main(String[] args){
		double[] num = new double [10];
		System.out.println("Enter 10 numbers: ");
		inputNumbers(num);
		System.out.println("mean: "+mean(num));
		System.out.println("s.d: "+deviation(num));
	}
	public static void inputNumbers(double[] num){
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<num.length; i++){
			num[i] = input.nextDouble();
		}
	}
	public static double mean(double[] num){
		double sum = 0;
		for(int i = 0; i<num.length; i++){
			sum+=num[i];
		}
		return sum/num.length;
	}
	public static double deviation(double[] num){
		double sumSq = 0;
		double m = mean(num);
		
		for(int i = 0; i<num.length; i++){
			sumSq += Math.pow(num[i]-m,2);
		}
		return Math.sqrt(sumSq/(num.length-1));
	}
}
