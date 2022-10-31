package assignments;

import java.util.Arrays;

public class ExceptionAssignment1 {

	public static void main(String[] args) {
		
		String[] numbers = {"1", "2", "3", "4", "5"};
		
//		ArrayIndexOutOfBounds Exception
//		String[] numbers = {"1", "2", "3", "4", "5", "6"};
		
//		IllegalArgument Exception
//		String[] numbers = {"1", "2", "3", "4", "Five"};
		
//		Arithmetic Exception
//		String[] numbers = {};
		
		
		try {
			int data[] = new int[5];
			for (int i=0; i<numbers.length; i++) {
				data[i] = Integer.parseInt(numbers[i]);
			}
			
			int total = Arrays.stream(data).sum();
			int average = total/numbers.length;
			
			System.out.println("Average is : " + average);
			System.out.println("Minimum is : " + Arrays.stream(data).min().getAsInt());
			System.out.println("Maximum is : " + Arrays.stream(data).max().getAsInt());
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.err.println("This program accept only 5 numbers.");
		}
		catch(IllegalArgumentException iae) {
			System.err.println("You can't convert that thing to an interger.");
		}
		catch(ArithmeticException ae) {
			System.err.println("This array is empty");
		}
	}
}
