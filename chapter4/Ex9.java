import java.util.Scanner;

public class Ex9{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String student,name="",tempString=""; 
		int score, max = 0,temp = 0; 
		
		System.out.print("Enter the number of students: ");
		int num = input.nextInt();
		
		while (num >= 1){
			System.out.print("Enter your name: ");
			student = input.next();
			System.out.print("Enter your score: ");
			score = input.nextInt();
			
			if(score > max){
				tempString = name;
				temp = max;
				max = score; 
				name = student;
			}
			num--;
		}
		
		System.out.println("------------------------------");
		System.out.println("Student "+name+" scored the highest score of "+max);
		System.out.println("Student "+tempString+" scored the highest score of "+temp);
	}
}
