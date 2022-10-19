package assignments;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class flowControlAssignment1 {

	public static void main(String[] args) throws ParseException {
		
		Scanner scanner = new Scanner(System.in);	
		String exit = "a";
		do {
			System.out.println("When do you go to bed?(hh:mm aa)");
			String sleepTime = scanner.nextLine();
			System.out.println();
			System.out.println("When do you get up?(hh:mm aa)");
			String wakeTime = scanner.nextLine();
			System.out.println();
			
			DateFormat sdf = new SimpleDateFormat("hh:mm aa");
			Date st1 = sdf.parse(sleepTime);
			Date wt1 = sdf.parse(wakeTime);
			
			
			long TotalMS;
			if (st1.before(wt1)) {
				TotalMS = wt1.getTime() - st1.getTime();
			}
			else if (st1.after(wt1)) {
				TotalMS = 86400000 - Math.abs(wt1.getTime() - st1.getTime());
//			86400000 is 24 hours in milliseconds
			}
			else {
				TotalMS = 86400000;
			}
			
			long TotalMin = TotalMS/60000;
			
			long hrs = TotalMin/60;
			long mins = TotalMin%60;
			
			System.out.println("You sleep " + hrs + " Hours and " + mins + " Minutes");
			System.out.println();
			
			if(TotalMin < 300 ) {
				System.out.println("You are very hardworking.");
			} else if (TotalMin > 480) {
				System.out.println("You are abnormal!");
			} else {
				System.out.println("You take care of your health well.");
			}
			
			System.out.println("\nType 'exit' to exit the program.");
			
			exit = scanner.nextLine();
			
			System.out.println();
			
		}while(!exit.equals("exit"));
		scanner.close();
	}

}
