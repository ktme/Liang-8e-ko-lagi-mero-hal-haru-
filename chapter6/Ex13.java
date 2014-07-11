public class Ex13 {
	public static void main(String[] args){
		for (int i = 1; i<=30; i++){
			System.out.print(getRandom(3,13)+ "   ");
		}
	}
	
	public static int getRandom(int ... numbers){
		return (numbers[0]+1)+(int)(Math.random()*((numbers[1]-numbers[0]-1))); //range must be shortened by 1 and starting number must be increased by 1
	}
}
