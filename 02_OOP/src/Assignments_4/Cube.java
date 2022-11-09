package Assignments_4;

public class Cube implements Shape{
	
    private int x;

    public Cube(){
        this.x = 0;
    }

    public Cube(int length){
        this.x = length;
    }
        
    public double Area(){
        return 6*x*x;
    }

    public double Volume(){
        return x*x*x;
    }
}
