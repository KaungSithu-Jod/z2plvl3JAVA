package assignments;

import java.util.Scanner;

public class StringAssignment3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("NRCNO(eg.1/yayaya(naing)111111 = ");
		String nrcno = scanner.nextLine();
		
		int slashindex = nrcno.indexOf("/");
		int openbrindex = nrcno.indexOf("(");
		int closebrindex = nrcno.indexOf(")");
		
		if (slashindex >= 0 && openbrindex >= 0 && closebrindex >= 0 && closebrindex > openbrindex && openbrindex > slashindex) {
			System.out.println("Township: " + nrcno.substring(slashindex+1,openbrindex));
			System.out.println("Number: " + nrcno.substring(closebrindex+1));
		} else {
			System.out.println("Input Invalid");
		}
		
		
		scanner.close();
	}

}
