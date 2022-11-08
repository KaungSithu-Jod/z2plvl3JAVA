package Assignments_1;

import java.util.Scanner;

public class Testing {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Student students[] = new Student[2];
		
		for (int i = 0; i<students.length; i++) {
			System.out.print("Enter Student ID : ");
			int studentID = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.print("Enter Student Name : ");
			String name = scanner.nextLine();
			
			System.out.print("Enter Student's mark : ");
			int mark = scanner.nextInt();
			
			students[i] = new Student(studentID, name, mark);
		}
		
//		display student details
		for (Student i : students) {
			i.display();
		}
		
		System.out.println("*************************");
		
//		start search student by id
		System.out.println("Enter the ID of student you want to search.");
		int searchID = scanner.nextInt();
		
		boolean present = false;
		for (Student i : students) {
			if (i.getStudentID() == searchID) {
				i.display();
				present = true;
			}	
		}
		if (!present) System.out.println("Student id-" + searchID + " is not found.");
		
		
//		Find Maximum and Average
//		Can't display all if you have more than one student with maximum marks
		int totalMark = 0;
		int max = 0;
		Student maxStudent = new Student();
		for (Student i : students) {
			
			totalMark += i.getMark();
			
			if(i.getMark()>max) {
				max = i.getMark();
				maxStudent = i;
				
			}
		}
		
		System.out.println("\nDetails of the Student with maximum Marks.");
		maxStudent.display();
		
		float averageMark = totalMark/students.length;
		System.out.println("Average Mark of students : " + averageMark);
		
		scanner.close();
	}
}
