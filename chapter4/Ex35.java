public class Ex35 {
	public static void main(String[] args){
		int i;
		double sum = 0.0d; 
		
		for (i = 624; i>=1 ; i--) {
			sum += 1.0d/(Math.sqrt(i)+Math.sqrt(i+1)) ;
		}
		System.out.println("Sum: "+sum);
	}
}
