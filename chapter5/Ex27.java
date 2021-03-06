public class Ex27 {
	public static void main(String[] args){
		int count = 1, i = 2;
		while (count <= 100) { //Find 100 Emirps
			if (!isReversible(i)){
				if(isPrime(i) && isPrime(reverseNum(i))){
					System.out.printf("%8d",i);
					if(count%10==0)	System.out.println();
					count++;
				}
			}
			i++; 
		}
	}
	
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // number is not a prime
			}
		}

		return true; // number is prime
	}
	
	public static boolean isReversible(int number){
		return (number==reverseNum(number));
	}
	
	public static int reverseNum(int number){
		int digit, reverse = 0 ; 
		
		while (number > 0){
			digit = number%10;
			reverse = reverse*10 + digit ; 
			number/=10;
		}
		return reverse;
	}
}
