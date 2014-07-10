public class Ex28 {
	public static void main(String[] args){
		System.out.println("i\t\tMersenne");
		for (int i = 2; i<=31; i++){
			if (isPrime(i)){
				System.out.println(i + "\t\t" +Mersenne(i));
			}
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
	
	public static int Mersenne(int number){
		return (int)(Math.pow(2,number) - 1);
	}
}
