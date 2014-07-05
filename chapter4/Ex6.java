public class Ex6 {
	public static void main(String[] args){
		double k1, m2;
		int m1 = 1, k2 = 20; 
		System.out.println("miles\t\tkilometers\tkilometers\tmiles");
		
		while (m1<= 10) {
			k1 = m1*1.609;
			m2 = k2/1.609;
			System.out.printf("%d\t\t%.3f\t\t%d\t\t%.3f\n",m1,k1,k2,m2);
			m1++;
			k2+=5;
		}
	}
}
