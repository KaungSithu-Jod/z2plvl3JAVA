package Assignments_4;

public class Circle implements Shape{

    private int radius;
    final float pi = 3.1415926535f; 

    public Circle(){
        this.radius = 0;
    }

    public Circle(int radius){
        this.radius = radius;
    }

    public double Area() {
        return pi * radius * radius;
    }

    public double Volume() {
        return 0;
    }
}
