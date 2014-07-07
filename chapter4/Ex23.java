public class Ex23{
	public static void main(String[] args){
		double sum=0; 
		System.out.println("Going left to right: ");
		for (int i = 1; i<=50000; i++){
			sum = sum + 1.0d/(double)i ;  
		}
		System.out.println("Sum: "+sum);
		
		sum=0; 
		System.out.println("Going right to left: ");
		for (int i = 50000; i>=1; i--){
			sum = sum + 1.0d/(double)i ;  
		}
		System.out.println("Sum: "+sum);
	}
}
