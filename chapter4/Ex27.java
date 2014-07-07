public class Ex27{
	public static void main(String[] args){
		int count = 1;
		for (int year = 2001; year<= 2100; year++){
			if((year%4==0 && year%100!=0 )|| (year%400 == 0)){ 
				if(count%10!=0){
					System.out.print(year+" ");
				}
				else {
					System.out.print(year);
					System.out.println();
					
				}
				count++;
			}
		}
	}
}
