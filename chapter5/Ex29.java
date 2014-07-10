public class Ex29 {
	public static void main (String[] args) {
		  
		int sum = dieSum();
		int point;
		
		if(sum == 2 || sum == 3 || sum == 12)
			System.out.println("You loose.");
		else if (sum == 7 || sum == 11)
			System.out.println("You win.");
		else {
			while(true){
				System.out.println("You are awarded a point.");
			
				point = dieSum();
				System.out.println("point is "+point);
				sum = dieSum();
			
				if (sum == 7) {
					System.out.println("You loose.");
					break;
				}
				else if(sum == point) {
					System.out.println("You win.");break;
				}
				else System.out.println("You loose.");
			}
		}
	}
	public static int dieSum(){
		int die1 = (int)(Math.random()*6)+ 1;
		int die2 = (int)(Math.random()*6)+ 1;
		int sum = die1+die2;
		System.out.println("You rolled "+die1+" + " + die2+ " = " + sum);
		
		return sum;
	}
}
