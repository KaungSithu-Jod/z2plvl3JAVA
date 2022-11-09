package Assignments_3;

public class Rectangle extends Shape{
    int length, width;

    public Rectangle(String color, int length, int width){
        this.setColor(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double Area(){
        return (length * width);
    }

    public void displayArea(){
        System.out.println(this.Area());
    }
}
