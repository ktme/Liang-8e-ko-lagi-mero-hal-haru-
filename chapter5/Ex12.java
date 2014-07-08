public class Ex12{
	public static void main(String [] args) {
		printChars('1','Z',10);
	}
	public static void printChars(char ch1,char ch2, int numberPerLine) {
		int i = 1;
		while (ch1<=ch2) {
			if (i%numberPerLine==0){
				System.out.print(ch1);
				System.out.println();
			}
			else 
				System.out.print(ch1);
			ch1++;i++;
		}
	}
} 
