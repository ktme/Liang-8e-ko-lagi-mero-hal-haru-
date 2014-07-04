import java.util.Scanner; 
public class Ex24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String output ="";
		int card =  (int)(Math.random() * 52 + 1);
		//1-clubs,2-diamonds,3-hearts,4-spades
		int suite = card/13;
		int face = card%13;
		if (suite == 1){
			if (face == 11)
				output = "The card you picked is Jack of Clubs";
			else if (face == 12) 
				output = "The card you picked is Queen of Clubs";
			else if(face == 13)
				output = "The card you picked is King of Clubs";
			else 
				output = "The card you picked is " + face + " of Clubs"; 
		}
		else if (suite == 2){
			if (face == 11)
				output = "The card you picked is Jack of Diamonds";
			else if (face == 12) 
				output = "The card you picked is Queen of Diamonds";
			else if(face == 13)
				output = "The card you picked is King of Diamonds";
			else 
				output = "The card you picked is " + face + " of Diamonds"; 
		}
		else if (suite == 3){
			if (face == 11)
				output = "The card you picked is Jack of Hearts";
			else if (face == 12) 
				output = "The card you picked is Queen of Hearts";
			else if(face == 13)
				output = "The card you picked is King of Hearts";
			else 
				output = "The card you picked is " + face + " of Hearts"; 
		}
		else {
			if (face == 11)
				output = "The card you picked is Jack of Spades";
			else if (face == 12) 
				output = "The card you picked is Queen of Spades";
			else if(face == 13)
				output = "The card you picked is King of Spades";
			else 
				output = "The card you picked is " + face + " of Spades"; 
		}
		
		System.out.println(output );
		
	}
}
