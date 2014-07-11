public class Ex14 {
	public static void main(String[] args){
		gcd(32,256,16,2);
	}
	
	public static int gcd(int ... numbers){
		int g = 0 ;
		for(int i = 0; i< numbers.length-1; i++){
			g = regularGCD(numbers[i+1],numbers[i]);
			numbers[i+1] = g; 
			System.out.println(g);
		}
		return g;
	}
	
	public static int regularGCD(int x, int y){
		while (y != 0) {
			if (x > y)
				x = x-y;
			else
				y =y-x;
		}
		return x;
	}
}
