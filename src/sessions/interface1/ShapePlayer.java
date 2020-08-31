package sessions.interface1;

public class ShapePlayer {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 20, "Rectangle", "Yellow");
        System.out.println(rectangle.calculateArea());
        rectangle.printShapeName();
        rectangle.setColor("Black");
        System.out.println(rectangle.getColor());

        Shape rect = new Rectangle(5, 10, "Rectangle", "Red");
        System.out.println(rect.calculateArea());
        rect.printShapeName();

    }

    /**
     *
     * @param shape
     * @return
     */
    public static double are(Shape shape) {

        return shape.calculateArea();
    }
}
