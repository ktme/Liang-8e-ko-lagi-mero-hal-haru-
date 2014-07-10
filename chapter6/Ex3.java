import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args){
		int occurrence[] = new int[100];
		int count = 0;
		System.out.println("Enter numbers between 1 and 100(inclusive): ");
		
		while (inArray(occurrence) != 0)
			count++;
		
		System.out.println("You input "+count+" numbers");
		
		displayArray(occurrence);
	}
	
	public static int inArray(int[] occurrence){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if(num==0) return 0;
		else occurrence[num-1]++;
		
		return num;
	}
	
	public static void displayArray(int[] occurrence){
		for(int i = 0; i<occurrence.length; i++){
			if(occurrence[i]!=0) 
				System.out.println((i+1)+ " occured " + occurrence[i] + " times");
		}
	}
}
