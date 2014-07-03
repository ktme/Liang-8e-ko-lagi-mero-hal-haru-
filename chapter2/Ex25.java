import java.util.Scanner; 
public class Ex25 {
  public static void main(String[] args) {
	int offset=0;
	Scanner input = new Scanner(System.in); 
	offset = input.nextInt()*60*60; // convert offset hours to seconds
	
	System.out.println("Enter offset to GMT: ");
    // Obtain the total milliseconds since midnight, Jan 1, 1970
    long totalMilliseconds = System.currentTimeMillis();

    // Obtain the total seconds since midnight, Jan 1, 1970
    long totalSeconds = totalMilliseconds / 1000 + offset;

    // Compute the current second in the minute in the hour
    long currentSecond = (int)(totalSeconds % 60);

    // Obtain the total minutes
    long totalMinutes = totalSeconds / 60;

    // Compute the current minute in the hour
    long currentMinute = (int)(totalMinutes % 60);

    // Obtain the total hours
    long totalHours = totalMinutes / 60;

    // Compute the current hour
    long currentHour = (int)(totalHours % 24);

    // Display results
    System.out.println("Current time is " + currentHour + ":"
      + currentMinute + ":" + currentSecond + " GMT");
  }
}
