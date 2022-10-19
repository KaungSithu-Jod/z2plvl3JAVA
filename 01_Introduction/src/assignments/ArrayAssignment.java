package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] cpu = {
				"core i3", "core i5", "core i7", "core i9"
		};
		
		String[] brand = {
				"lenovo", "hp", "samsung", "acer", "dell", "asus"
		};
		
		float[][] data = {
				{230.21f, 400.21f, 292.2f, 693.33f, 340.44f, 691.99f},
				{529.483f, 920.483f, 676.66f, 1594.659f, 783.012f, 1591.577f},
				{552.504f, 960.504f, 706.08f, 1663.992f, 817.056f, 1660.776f},
				{690.63f, 1200.63f, 882.6f, 2079.99f, 1021.32f, 2075.97f}
		};
		
		System.out.println("Enter brand names from " + Arrays.toString(brand));
		String brandChosed = scanner.nextLine();
		System.out.println();
		
		System.out.println("Enter cpu from " + Arrays.toString(cpu));
		String cpuChosed = scanner.nextLine();
		
		int bCindex = Arrays.binarySearch(brand, brandChosed);
		int cpuCindex = Arrays.binarySearch(cpu, cpuChosed);
		
		System.out.println("Enter Dollar Exchange Rate: ");
		float exR = scanner.nextFloat();
		if (bCindex < 0 || cpuCindex < 0) {
			System.out.println("Invalid Inputs");
		} else {
			System.out.print("Price of " + brandChosed + " with " + cpuChosed + " is : " + (data[cpuCindex][bCindex] * exR));
		}
		scanner.close();
	}

}
