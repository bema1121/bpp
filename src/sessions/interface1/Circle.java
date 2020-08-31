package sessions.interface1;

public class Circle implements Shape {

    private double  radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
    }



    @Override
    public double calculateArea() {
        return 0;
    }
    @Override
    public void printShapeName() {

    }

    @Override
    public void setColor(String color) {

    }


}
