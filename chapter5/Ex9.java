public class Ex9{
	public static void main(String[] args){
		double feet=1.0, meters = 20.0;
		
		System.out.println("Feet\t\tMeters\t\tFeet\t\tMeters");
		
		for (int count = 10; count >= 1; count--){
			System.out.printf("%.1f\t\t%.3f\t\t%.1f\t\t%.3f\t\t\n",
			feet,footToMeter(feet),meters,MeterToFoot(meters));
			feet++;
			meters+=5.0;
		}
	}
	
	public static double footToMeter(double foot){
		return foot*.305; 
	}
	
	public static double MeterToFoot(double meter){
		return meter/0.305; 
	}
}
