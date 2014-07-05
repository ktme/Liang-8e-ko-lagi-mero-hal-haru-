public class Ex3 {
	public static void main(String[] args){
		double pounds;
		int kilograms = 1; 
		System.out.println("Kilograms\t\tPounds");
		
		while (kilograms <= 199) {
			pounds = kilograms/0.454;
			System.out.println(kilograms + "\t\t\t" + pounds);
			kilograms+=2;
		}
	}
}
