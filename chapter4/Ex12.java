public class Ex12 {
	public static void main(String [] args){
		int i = 1;
		while(i <= 200){
			i++;
			if(Math.pow(i,2)>12000)
				break;
		}
		System.out.println("The smallest n such that n^2 > 12,000 is :"+i);
	}
}
