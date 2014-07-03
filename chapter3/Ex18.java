import javax.swing.JOptionPane; 

public class Ex18 {
	public static void main(String[] args){
		String output;
		String yearString = JOptionPane.showInputDialog("Enter year: ");
		int year = Integer.parseInt(yearString);

		if((year%4==0 && year%100!=0 )|| (year%400 == 0)) 
			output = year + " is a Leap year.";
		else 
			output = year + " is not a Leap year.";
		

		JOptionPane.showMessageDialog(null,output);
	}
}
