package sessions.classes_objects;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Animal animal = new Animal("Dog", "Labrador", 2, 0,'M', 12,false);

        //there are two ways we can use instance variables
        //1) to set a value
        //2) to get the value that the variable is holding.
        System.out.println(animal.getType());
        //animal.type = "Not a dog";

        System.out.println(animal);
    }

}
