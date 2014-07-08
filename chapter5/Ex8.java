
public class Ex8{
	public static void main(String[] args){
		double cel=40.0, fah = 120.0;
		
		System.out.println("Celcius\t\tFahrenheit\tFahrenheit\tCelcius");
		
		for (int count = 9; count >= 1; count--){
			System.out.printf("%.1f\t\t%.1f\t\t%.1f\t\t%.2f\t\t\n",
			cel,celciusToFahrenheit(cel),fah,fahrenheitToCelcius(fah));
			cel--;
			fah-=10.0;
		}
	}
	
	public static double celciusToFahrenheit(double celcius){
		return (9.0/5.0)*celcius + 32; 
	}
	
	public static double fahrenheitToCelcius(double fahrenheit){
		return (5.0/9.0)*(fahrenheit-32); 
	}
}
