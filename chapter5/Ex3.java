public class Ex3 {
	public static void main(String[] args){
		System.out.println(reverse(234));
	}
	
	public static int reverse(int n){
		int reverse = 0,digit;
		while (n>0){
			digit = n%10; 
			reverse = digit + reverse*10;
			n/=10;
		}
		
		return reverse;
	}
}
