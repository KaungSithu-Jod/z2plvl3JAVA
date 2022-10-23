package day6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

	public static void main(String[] args) {
		
//		predefined constants
		
		DateTimeFormatter f1 = DateTimeFormatter.BASIC_ISO_DATE;
		DateTimeFormatter f2 = DateTimeFormatter.ISO_LOCAL_TIME;
		DateTimeFormatter f3 = DateTimeFormatter.ISO_DATE_TIME;
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		String s1 = date.format(f1);
		String s2 = f1.format(date);
		
		System.out.println("Default date: " +  date);
		System.out.println("ISO format: " + s1);
		System.out.println("ISO format: " + s2);
		
		System.out.println("Default time: " + time);
		System.out.println("ISO format: " + f2.format(time));
		
		System.out.println("Default dateTime: " + dateTime);
		System.out.println("ISO format: " + f3.format(dateTime));
		
	}

}
