package day2;

import java.util.Scanner;

public class Testing_1 {
	
	static final int MIN_PRICE = 1000;
	static final float RATE = 1.5f;
	
	public static void main(String[] args) {
//		create stream
		Scanner sc = new Scanner(System.in);
//		user input
		System.out.print("Enter Price: ");
		int price = sc.nextInt();
//		filter
		if (price < MIN_PRICE) {
			price = MIN_PRICE;
		}
//		output
		System.out.println("Price = " + price);
		System.out.println("Expense = " + price * RATE);
		
		sc.close();
	}
}
