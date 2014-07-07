public class Ex33 {
	public static void main(String[] args){
		int i,j;
		int sum = 0; 
		
		for (i = 2; i<=10000; i++) {
			sum = 0; 
			for (j = 1; j <= i/2; j++){
				if(i%j==0){
					sum+=j; 
				}
			}
			if(sum==i) System.out.println(i+" is Perfect");
		}
	}
}
