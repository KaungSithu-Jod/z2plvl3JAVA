package Assignments_4;

public class PolymorphismTest {
    public static void main(String[] args){
        Shape[] shapes = new Shape[4];

        shapes[0] = new Cube();
        shapes[1] = new Cube(4);
        shapes[2] = new Circle();
        shapes[3] = new Circle(4);

        for (int i = 0; i < shapes.length; i++){
            System.out.println("Shape " + (i+1));
            System.out.println("Area : " + shapes[i].Area());
            System.out.println("Volume : " + shapes[i].Volume());
            System.out.println("##################");
        }

    }
}
