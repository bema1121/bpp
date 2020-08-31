package sessions.classes_objects;

public class BunnyDemo {

    public static void main(String[] args) {
        //Constructors are the only way to create objects.
        //What is default constructor
        //a no argument constructor that was created by java
        //bc no constructor was created explicitly.
        Bunny b1 = new Bunny();
        Bunny b2 = new Bunny();
        System.out.println(b1.color);
        System.out.println(b1.length);
        Bunny b3 = new Bunny("White");
        Bunny b4 = new Bunny("Gray");
        System.out.println(b3.color);
        System.out.println(b3.length);
        System.out.println(b3.height);
        System.out.println(b3.gender);
        System.out.println();
        System.out.println(b4.color);
        System.out.println(b4.length);
        System.out.println(b4.height);
        System.out.println();
        //What if I create an object.
        //You can only create objects with the constructors
        //that are defined in the class. param numbers and types must match.
        //Bunny b5 = new Bunny("Color", 20); => create a constructor which will take the color and length.
        //Trick -> also, create a constructor which will take color and height.
        Bunny b5 = new Bunny("Green", 6,7);
        System.out.println(b5.color);
        System.out.println(b5.length);
        System.out.println(b5.height);
        System.out.println(b5.gender);
        //create a List before and pass the variable to the param.
        //Bunny b9 = new Bunny("Green", 6,7, "M", ) Thanks to Akinai.
        //use the last constructor too
    }


}
