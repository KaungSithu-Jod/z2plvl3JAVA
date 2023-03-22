package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Assignment1 {
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<>(Arrays.asList("Oheb","Kelra","CW","Markyyy","ACE"));
		
		System.out.println("All Students : " + students);
		
		Collections.sort(students);
		System.out.println("After Sorting : " + students);
		
		int result = Collections.binarySearch(students, "ACE");
		System.out.println((result<0)? "ACE is not found" : "ACE's Position in the list is " + (result+1)  );
		
		students.add("King");
		
		System.out.print("Starts with K : ");
		students.forEach(student -> {
			if (student.startsWith("K") || student.startsWith("k"))
			System.out.print(student + ", "); 
		});
		
		System.out.println();
		
		students.removeIf(student -> (student.endsWith("G") || student.endsWith("g")));
		System.out.println("After Removal : " + students);
		
		students.clear();
		
	}
}
