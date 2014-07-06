import java.util.Scanner; 

public class Ex17 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
		int n = input.nextInt();
		int i,j,k,x;
		boolean flag;  
		for (i = 1; i <= n; i++) {  // number of lines to loop through
			x=i;                    // x is what is printed  
			flag = false;           // this will determine addition or subtraction    
			for (k = n-1; k >= i; k-- )   //padding 
				System.out.print("  ");
			for (j = 1 ; j<2*i; j++){      // loops an odd number of times
			    System.out.print(x+" ");
			    if(x==1) flag = true;      //flag will be set once '1' has been reached 
			    
			    if (flag) x++; 
			    else x--;
			}
			System.out.println();
		}
			
	}
}

