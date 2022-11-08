package Assignments_1;

public class Student {
	
//	fields
	private int studentID, mark;
	private String name;
	
//	constructor
	public Student() {
		
	}
	public Student(int studentID, String name, int mark) {
		this.studentID = studentID;
		this.name = name;
		this.mark = mark;
	}
	
//getter setter
	public int getStudentID() { return studentID; }
	
	public void setStudentID( int studentID ) { this.studentID = studentID; }
	
	public String getName() { return name; }
	
	public void setName( String name ) { this.name = name; }
	
	public int getMark() { return mark; }
	
	public void setMark( int mark ) { this.mark = mark; }
	
//	display method
	public void display() {
		System.out.println();
		System.out.println("Student ID : '" + this.studentID + "'\tName : '" + this.name + "'\tMark : '" + this.mark + "'");
		System.out.println();
	}
	
}
