import java.util.Scanner; 
public class Ex1 {
	public static void main(String[] args){
		int best = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = input.nextInt();
		
		int grades [] = new int[n];
		System.out.print("Enter "+n+" scores: ");
		best = inputGrades(grades);
		System.out.println("Results: ");
		displayGrades(grades,best);	
	}
	
	public static int inputGrades(int []grades){
		Scanner input = new Scanner(System.in);
		int best = 0;
		for (int i = 0; i<grades.length ;i++){
			grades[i]=input.nextInt();
			if(grades[i]>best) best = grades[i];
		}
		return best;
	}
	
	public static void displayGrades(int []grades,int best){
		for (int i = 0; i<grades.length; i++){
			if(grades[i]>=best-10) System.out.println("Student "+i+" score is "+grades[i]+" and grade is A");
			else if(grades[i]>=best-20) System.out.println("Student "+i+" score is "+grades[i] +" and grade is B");
			else if(grades[i]>=best-30) System.out.println("Student "+i+" score is "+grades[i]+" and grade is C");
			else if(grades[i]>=best-40) System.out.println("Student "+i+" score is "+grades[i]+" and grade is D");
			else System.out.println("Student "+i+" score is F");
		}
	}
}
