public class Ex32 {
	public static void main (String[] args) {
		int point,sum; 
		int wins = 0,losses = 0;
		
		
		int count = 1;
		while (count <= 10000){
			sum = dieSum();
			if(sum == 2 || sum == 3 || sum == 12) losses++;
			else if (sum == 7 || sum == 11) wins++;
			else {
				point = dieSum();
				sum = dieSum();
			
				if (sum == 7) losses++;
				else if(sum == point) wins++;
				else losses++;
			}
			count++;
		}
		System.out.println("wins: "+wins);
		System.out.println("losses: "+losses);
		
	}
	
	public static int dieSum(){
		int die1 = (int)(Math.random()*6)+ 1;
		int die2 = (int)(Math.random()*6)+ 1;
		int sum = die1+die2;
		return sum;
	}
}
