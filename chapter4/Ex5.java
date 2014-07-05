public class Ex5 {
	public static void main(String[] args){
		double p1,k2;
		int k1 = 1,p2 = 20; 
		System.out.println("Kilograms\tPounds\tPounds\t\tKilograms ");

		while (k1 <= 199) {
			p1 = k1 * 2.2;
			k2 = p2 / 2.2;
			System.out.printf("%d\t\t%.2f\t%d\t\t%.2f\n",k1,p1,p2,k2);
			k1+=2;
			p2+=5;
		}
	}
}
