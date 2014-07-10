public class Ex30{
	public static void main(String[] args){
		int count = 2, twin;
		while (count <= 1000) { //Find all twin primes less than 1000
			if(isPrime(count)){
				if(isPrime(count+2))
					System.out.printf("(%3d,%3d)\n",count,count+2);
			}
			count++;
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
}
