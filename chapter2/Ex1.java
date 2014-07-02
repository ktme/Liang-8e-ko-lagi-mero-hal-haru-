import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args){
		double cel,fah;   //celsius and fahrenheit 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a degree in Celsius:");
		cel = input.nextDouble();
		
		fah = 1.8*cel + 32;
		System.out.println(cel + " Celsius is " + fah +" Fahrenheit");
		
	}
}

