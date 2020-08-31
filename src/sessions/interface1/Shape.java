package sessions.interface1;

public interface Shape {

    //when do we use static final variable?
    //when there is a need to have certain values that will be applicable
    //for all objects created from the class
    //and it should not be changed at all
    //we can use static final variables

    //ex: Person
    //static final String WELCOME_MESSAGE = "Hello";

    String WELCOME_MESSAGE = "Hello";

    //public abstract -> are implicitly placed before methods

    /**
     * calculate area of the shape
     * @return area
     */
    double calculateArea();

    /**
     * Print name of the shape
     */
    void printShapeName();

    /**
     *all shapes must have color
     * so the color should be able to
     * be changed via this method
     * @param color => color of the shape
     */
    void setColor(String color);

}
