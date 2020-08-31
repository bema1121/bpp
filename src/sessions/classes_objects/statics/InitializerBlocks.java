package sessions.classes_objects.statics;
import sessions.classes_objects.Animal;
public class InitializerBlocks {

    public static void main(String[] args) {
        //Initializer blocks are used to intialize class level variables both instance and static.
        //to initialize instance variables we use instance initializer
        //to initialize static variables we use static initializer
        //the whole point of init(initializer) is to assign values to variables in one place.
        //to split the focus into two, 1)what we have as properties of class, and 2) what are the default hard coded values
        //1. static variables
        //2. static initializer => but run only once per class per program
        //3. instance vars
        //4. instance initializer
        //5. constructor
        Animal animal = new Animal("Dog", "Labrador", 2, 0, 'M', 12, false);
        Animal animal2 = new Animal("Cat", "Garfield", 1, 0, 'F', 9, true);
        Animal animal3 = new Animal();
        System.out.println(animal3.getWeight());
    }

}