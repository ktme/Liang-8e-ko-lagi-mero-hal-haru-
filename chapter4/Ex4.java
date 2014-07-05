public class Ex4 {
	public static void main(String[] args){
		double kms;
		int miles = 1; 
		System.out.println("miles\t\tkilometers");
		
		while (miles <= 199) {
			kms = miles*1.609;
			System.out.println(miles + "\t\t\t" + kms);
			miles++;
		}
	}
}
