import java.util.Scanner;

public class Ex38 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal integer: ");
		int number = input.nextInt(); 
		int digit;
		String hex="";
		
		
		//what follows is an algorithm that produces the hex equivalent in reverse
		//so we concatenate the string in reverse order to get the result in the correct order 
		while(number > 0){
			digit = number%16; //extract remainder 0-15
			number /= 16; 
			
			if (digit>9) {
				switch(digit){
					case 10: hex = "A" + hex;break;
					case 11: hex = "B" + hex;break;
					case 12: hex = "C" + hex;break;
					case 13: hex = "D" + hex;break;
					case 14: hex = "E" + hex;break;
					case 15: hex = "F" + hex;break;
				}
			}
			else {
				if (digit == 0) hex = "0" + hex;
				else hex = digit + hex;
			}
		}
		System.out.println(hex);
	}
}
