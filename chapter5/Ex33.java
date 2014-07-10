public class Ex33 {
	public static void main(String[] args){
		cTime();
		cDate();
	}
	
	public static int totalSecSinceEpoch(){
		return (int)(System.currentTimeMillis()/1000 )- (5 * 60 * 60);
	}
	
	public static void cTime(){
		System.out.println(cHour()+":"+cMin()+":"+cSec());
	}
	
	public static int cSec(){
		return totalSecSinceEpoch()%60;
	}
	
	public static int cMin(){
		return (totalSecSinceEpoch()/60)%60; 
	}
	
	public static int cHour(){
		return (((totalSecSinceEpoch()/60)/60)%24); 
	}
	
	public static void cDate(){
		System.out.println(cYear()+" "+cMonth()+" "+cDay());
	}
	
	public static int cYear(){
		return 1970 + totalSecSinceEpoch()/(86400*365);
	}
	
	public static int cMonth(){
		int month = 1;
		int days = daysRemaining();
		
		while(days > 28) {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				days -= 31;

			else if  (month == 4 || month == 6 || month == 9 || month == 11)
				days -= 30;

			else{
				if(isLeap(cYear())) days-=29 ;
				else days -=28;
			}
			month++;
		}
		return month;	 
	}
	
	public static int cDay(){
		int days = daysRemaining();
		
		for (int month  = 1; month<cMonth();month++){
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				days -= 31;

			else if  (month == 4 || month == 6 || month == 9 || month == 11)
				days -= 30;

			else{
				if(isLeap(cYear())) days-=29 ;
				else days -=28;
			}	
		}
		return days+1;
	}
	
	public static int daysRemaining(){
		int days = totalSecSinceEpoch()/86400 ; // assign total days since epoch 
		int leap=0, nonLeap=0;
		for (int i = 1970; i<cYear(); i++){
			if(isLeap(i)) leap++;
			else nonLeap++;
		}
		days = days-366*leap - 365*nonLeap;
		return days;
	}
	
	public static boolean isLeap(int year){
		return ((year%4==0 && year%100!=0) || year%400==0);
	}
}
