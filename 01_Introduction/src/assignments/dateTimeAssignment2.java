package assignments;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class dateTimeAssignment2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm:ss a");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
		
		String[] townships = {"AA", "BB", "CC", "DD"};
		int[] times = {15, 30, 10, 45};
		String[] menus = {"Pizza", "Burger", "Milk Tea", "Spicy Noodle"};
		
		System.out.println("******Available Menu*******");
		for (int i=0; i<menus.length; i++) {
			System.out.println((i + 1) + ". "  + menus[i]);
		}
		System.out.print("Please choose Item(type the number): ");
		int item = scanner.nextInt();
		
		System.out.println("******Deliverable Townships*******");
		for (int i=0; i<townships.length; i++) {
			System.out.println((i + 1) + ". "  + townships[i] + "( " + times[i] + " mins )");
		}
		System.out.print("Please choose Township(type the number): ");
		int town = scanner.nextInt();
		
		System.out.println("******Order Type*******\n1. Order Now?\n2. Preorder?\nPlease Choose 1 or 2: ");
		int orderType = scanner.nextInt();
		
		if (item < 1 || item > 4 || town < 1 || town > 4 || orderType < 1 || orderType > 2) 
		{
			System.out.println("Invalid Inputs");
		}
		else if (orderType == 1) 
		{
			LocalTime odTime = LocalTime.now();
			LocalTime arTime = odTime.plusMinutes(times[town-1]);
			
			System.out.println("******Your Order Information******");
			System.out.println("Item Name: " + menus[item-1]);
			System.out.println("Your Address: " + townships[town-1]);
			System.out.println("Duration: " + times[town-1]);
			System.out.println("Arrival Time: " + arTime.format(f1));
			System.out.println("******Thank You For Ordering******");
		} 
		else if (orderType == 2) 
		{
			System.out.println("Enter Deliver Date (dd): " );
			int day = scanner.nextInt();
			LocalDate odDate = LocalDate.now();
			LocalDate arDate = odDate.plusDays(day);
			
			System.out.println("******Your Order Information******");
			System.out.println("Item Name: " + menus[item-1]);
			System.out.println("Your Address: " + townships[town-1]);
			System.out.println("Arrival Date: " + arDate.format(f2));
			System.out.println("******Thank You For Ordering******");
		}
		
		scanner.close();
	}

}
