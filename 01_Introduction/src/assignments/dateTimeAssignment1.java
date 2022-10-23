package assignments;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateTimeAssignment1 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
		DayOfWeek dayOfWeek = today.getDayOfWeek();
		
		System.out.println(today.format(f1));
		System.out.println("\n*********************\n");
		if (dayOfWeek.equals(DayOfWeek.of(6)) || dayOfWeek.equals(DayOfWeek.of(7))) {
			System.out.println("Today is my holiday");
		} else {
			System.out.println("I have no time. I'm studying programming.");
		}
	}

}
