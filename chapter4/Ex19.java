public class Ex19 {
	public static void main(String[] args){
		
		int i,j,k,x;               //x is used as a power of 2;
		boolean flag;  
		for (i = 1; i <= 8; i++) {  // number of lines to loop through
			x=0;                      
			flag = false;           // this will determine addition or subtraction of the power 'x'    
			for (k = 7; k >= i; k-- )   //padding 
				System.out.print("     ");
			for (j = 1 ; j<2*i; j++){      // loops an odd number of times
			    System.out.printf("%5d",(int)Math.pow(2,x)); 
				if (x == i-1) flag=true;
				if (flag) x--;
				else x++;
			} 
			System.out.println();
		}
	}
}


