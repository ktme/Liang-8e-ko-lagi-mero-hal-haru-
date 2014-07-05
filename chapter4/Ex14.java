public class Ex14 {
	public static void main(String [] args){
		char i = '!';
		int x = 0;
		while(i <= '~'){
			System.out.print(i+" ");
			i++;
			x++; 
			if(x%10 == 0) System.out.println();
		}
	}
}
