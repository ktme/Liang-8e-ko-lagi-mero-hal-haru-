
public class Ex18 {
	public static void main(String[] args){
		System.out.println("Pattern I");
		int i, j;
		for (i = 1; i<= 6; i++){
			for (j = 1; j <= i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		System.out.println("Pattern II");
		for (i = 6; i >= 1; i--){
			for (j = 1; j <= i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		System.out.println("Pattern III");
		for (i = 1; i <= 6; i++){
			for (j = 6; j >= 1; j--){
				if(j<=i)
					System.out.print(j+" ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		System.out.println("Pattern IV");
		for (i = 6; i >= 1; i--){
			for (j = i-5; j <= i;j++){
				if (j<1) 
					System.out.print("  ");
				else 
					System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
}
