public class Ex32 {
	public static void main (String[] args) {
		int point,sum; 
		int wins = 0,losses = 0;
		
		
		int count = 0;
		while (count < 10000){
			count++;
			if(isWin()) wins++;
			else losses++;
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
	public static boolean isWin() {
		int sum = dieSum();
		int point;
		if (sum == 7 || sum == 11) return true;
        else if (sum == 2 || sum == 3 || sum == 12) return false;
		
		while (true) {
            point = dieSum();
            if (point == 7) return false;
            else if  (point == sum) return true;
        } 
    }
}
