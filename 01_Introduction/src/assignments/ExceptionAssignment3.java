package assignments;

import java.util.Scanner;

class InvalidMarkException extends Exception{
	public InvalidMarkException(String s) {
		super(s);
	}
}

public class ExceptionAssignment3 {
	
	static void validateMark(int mark) throws InvalidMarkException {
		if (mark<0 || mark>100) {
			throw new InvalidMarkException("This mark is invalid.");
		} else {
			System.out.println("Student Mark : " + mark);
		}
	}
	
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
		
		System.out.println("Enter Student Mark");
		int mark = scanner.nextInt();
		validateMark(mark);
		} 
		catch (InvalidMarkException e) {
			System.err.println(e.getMessage());
		}
	}
}

