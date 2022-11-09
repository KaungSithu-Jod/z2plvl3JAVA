package Assignments_2;

public class Teacher extends Person{
    // fields
    private String position, department, salary;

    // constructor
    public Teacher() {

    }
    
    public Teacher(String name, String nrcno, String address, String phone, String position, String department, String salary){
        super(name, nrcno, address, phone);
        this.setPosition(position);
        this.setDepartment(department);
        this.setSalary(salary);
    }

    // getter
    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public String getSalary() {
        return salary;
    }

    // setter
    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    // methods
    public void promote(String toPosition, String newSalary) {
        this.position = toPosition;
        this.salary = newSalary;
    }

    public void transfer(String toDepartment) {
        this.department = toDepartment;
    }

    public void showTeacherInfo() {
        super.showInfo();
        System.out.println("Position : " + position);
        System.out.println("Department : " + department);
        System.out.println("Salary : " + salary);
    }
}
