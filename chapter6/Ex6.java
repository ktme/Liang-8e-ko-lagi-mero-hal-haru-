public class Ex6{
    public static void main(String[] args) {
        int count = 0; 
        int number = 2; 
	    int prime[] = new int[50];
        System.out.println("The prime numbers are:");

		while (count < 50) {
			boolean isPrime = true; 
        
			for (int i = 0; prime[i] <= (int)(Math.sqrt(number)) && i<count; i++) {
				if (number % prime[i]== 0) { 
					isPrime = false;          
					break; 
				}
			}
		
			if (isPrime) {
				prime[count] = number;
				System.out.println((count+1)+"). "+prime[count]);
				count++; 
			}
			number++;
		}
		System.out.println("\n" + count + " prime(s)");
	}
}   
