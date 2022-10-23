package day6;

import java.time.LocalDate;

public class JavaDateTimeAPI {

	public static void main(String[] args) {
		
//		createDate
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2016, 10, 16);
		LocalDate date3 = LocalDate.parse("2016-10-16");
		
		System.out.println("date1: " + date1);
		System.out.println("date2: " + date2);
		System.out.println("date3: " + date3);
		
		LocalDate yesterday = date1.minusDays(1);
		System.out.println("yesterday: " + yesterday);
		
		System.out.println("tomorrow: " + date1.plusDays(1));
		System.out.println("CurrentYear: " + date1.getYear());
		System.out.println("CurrentMonth: " + date1.getMonth());
		System.out.println("CurrentMonth: " + date1.getMonthValue());
		System.out.println("CurrentDay: " + date1.getDayOfMonth());
		System.out.println("CurrentDayofWeek: " + date1.getDayOfWeek());
		
		System.out.println("day2 ==  day3: " + date2.equals(date3));
		System.out.println("Is date1 Leap Year? : " + date1.isLeapYear());
	}

}
