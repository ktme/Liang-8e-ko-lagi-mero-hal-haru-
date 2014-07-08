public class Ex10 {
  public static void main(String[] args) {
    printPrimeNumbers();
  }

  public static void printPrimeNumbers() {
     int i = 2, count = 0;
     while (i<=10000){
	     if (isPrime(i)) count++;	 
		 i++;
	} 
	 System.out.println("There are "+count+" primes less than 10000");
  }

  /** Check whether number is prime */
  public static boolean isPrime(int number) {
    for (int divisor = 2; divisor <= number / 2; divisor++) {
      if (number % divisor == 0) { // If true, number is not prime
        return false; // number is not a prime
      }
    }

    return true; // number is prime
  }
}
