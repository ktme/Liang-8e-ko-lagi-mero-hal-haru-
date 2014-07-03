import java.util.Scanner;

public class Ex7 {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive the amount
    System.out.print(
      "Enter an amount in double, for example 23.67: ");
    double amount = input.nextDouble();

    int remainingAmount = (int)(amount * 100);

    // Find the number of one dollars
    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;

    // Find the number of quarters in the remaining amount
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    // Find the number of dimes in the remaining amount
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    // Find the number of nickels in the remaining amount
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    // Find the number of pennies in the remaining amount
    int numberOfPennies = remainingAmount;

    // Display results
    if (numberOfOneDollars != 0) {
		if (numberOfOneDollars == 1)
			System.out.print("Your amount " + amount + " consists of \n" +"\t" + numberOfOneDollars + " dollar\n");
		else 
			System.out.print("Your amount " + amount + " consists of \n" +"\t" + numberOfOneDollars + " dollars\n");
    }
    if (numberOfQuarters!= 0) {
		if (numberOfQuarters== 1) 
			System.out.print("\t" + numberOfQuarters + " quarter\n" );
		else 
			System.out.print("\t" + numberOfQuarters + " quarters\n" );
    }
    if (numberOfDimes != 0) {
		if (numberOfDimes  == 1)
			System.out.print("\t" + numberOfDimes + " dime\n" );
		else 
			System.out.print("\t" + numberOfDimes + " dimes\n" );
    }
    if (numberOfNickels  != 0) {
		if(numberOfNickels ==1)
			System.out.print("\t" + numberOfNickels + " nickel\n");
		else 
			System.out.print("\t" + numberOfNickels + " nickels\n");
    }
    if (numberOfPennies!= 0) {
		if(numberOfPennies == 1)
			System.out.println("\t" + numberOfPennies + " penny");
		else 
			System.out.println("\t" + numberOfPennies + " pennies");
	}
  }
}
