import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args){
		double pounds, kilograms;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number in pounds: ");
		pounds = input.nextDouble();
		
		kilograms = pounds*0.454;
		
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}
}

