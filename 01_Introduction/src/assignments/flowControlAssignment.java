package assignments;

import java.util.Scanner;

public class flowControlAssignment {

	public static void main(String[] args) {
		int count, positiveCount = 0, negativeCount = 0, zeroCount = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to type?");
		count=scanner.nextInt();
		
		for(int i=0; i<count; i++) {
			int number;
			System.out.print("Enter any number : ");
			number = scanner.nextInt();
			
			if (number < 0) negativeCount++;
			else if (number > 0) positiveCount++;
			else zeroCount++;
		}
		System.out.println("Numbers of Zero : " + zeroCount);
		System.out.println("Numbers of Positive Numbers : " + positiveCount);
		System.out.println("Numbers of Negative Numbers : " + negativeCount);
		scanner.close();
	}

}
