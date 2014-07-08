public class Ex20{
	public static void main(String [] args){
		System.out.println("i\t\t\t sin\t\t\t cos");
		for (int i = 0; i <= 360; i+=10 ){
			System.out.printf("%d\t\t\t%7.4f\t\t\t%7.4f\n",i,Math.sin(i),Math.cos(i));
		}
	}
}
