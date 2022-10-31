package assignments;

import java.util.Scanner;

public class ExceptionAssignment2 {

	public static void main(String[] args) {
		
		String[] division =  {"AA", "BB", "CC", "DD", "EE", "FF", "GG", "HH", "II", "JJ", "KK", "LL", "MM", "NN"};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input Your NRC: ");
		String NRC = scanner.nextLine();
		
		String[] NRCsplit = NRC.split( "[/()]");
		
		try {
			int divNO = Integer.parseInt(NRCsplit[0]) - 1;
			
			System.out.println("Division/State : " + division[divNO]);
			System.out.println("City : " + NRCsplit[1]);
			System.out.println("Number : " + NRCsplit[3]);
			
		}
		catch(IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
			System.err.println("Your Input is INVALID!");
		}
		finally {
			scanner.close();
		}
		
	}

}
