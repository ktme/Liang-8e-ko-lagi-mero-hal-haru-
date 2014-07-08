public class Ex2 {
	public static void main(String[] args){
		System.out.println(sumDigits(234));
	}
	
	public static int sumDigits(int n){
		int sum = 0,digit;
		while (n>0){
			digit = n%10; 
			sum += digit;
			n/=10;
		}
		
		return sum;
	}
}
