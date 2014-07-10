public class Ex26 {
	public static void main(String[] args){
		int count = 0, i = 2;
		while (count <= 100) { //Find 100 Palindromic Primes
			if (isReversible(i)){
				if(isPrime(i)){
					count++;
					System.out.printf("%8d",i);
					if(count%10==0)	System.out.println();
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
		int digit, reverse = 0 ;
		int n = number; 
		while (number > 0){
			digit = number%10;
			reverse = reverse*10 + digit ; 
			number/=10;
		}
		return (n==reverse);
	}
}
