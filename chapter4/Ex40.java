public class Ex40{
	public static void main(String[] args){
		int flip; 
		int heads = 0, tails = 0; 
		for (int x = 1; x <= 1000000; x++){
			flip = (int) (Math.random()*2); 
			if(flip == 0) tails++;
			else heads++;
		}
		System.out.println("Heads:"+heads);
		System.out.println("Tails:"+tails);
	}
}
