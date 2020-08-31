package sessions.classes_objects.statics;
import sessions.classes_objects.Animal;
public class StaticInJava {

    //What is static in java?
    //optional specifier
    //static means property(variable, method, class(inner class), initializer) that doesnt belong to an object rather it belong to a class.
    //variable, methods and class can be declared as static.
    //when the variable is declared as static it means that is an information that is not tied to a specific object, rather
    //it is a piece of common information for all objects that were created from the class.
    //or a piece info that we dont want to tie to objects, rather some internal info that can be used for all objects equally.
    //Usage
    //static references can be used in  both static and non-static methods
    //instance variables can only be used within instance methods.
    //the reason why is static references are meant to be separate from instance variables(Info)
    //have an a ability to count how many instances(objects) have been created from one class?
    //static variables are created as a soon as the first object from the class has been created and it will live until the end of of a program
    //the value of the static variable doesnt change from one object creation to another object.
    //rather when one object modifies the static variable the updated value will be applied to all other objects as well(class level).
    //instance variables are created once an object is created and it's specific(belongs) to that object.
    //instance variables are initialized after every constructor call.
    //it will live until that very object is destroyed in the heap.
    //instance variables are characteristics of an object. so information specific to an object.
    //1. If you want to gather info about all objects being created from the class that info should be static
    //2. If you want to have info that will be the same and should be applied to all objects that are created from the class
    //   we should use static.
    //static methods
    //static methods are methods that dont define behavior for an object thus they dont modify the state of an object.
    //rather static methods are used to write actions not related to objects
    //util methods that dont require creating a method.
    public static void main(String[] args) {
        //static method as a helper method that does cool stuff.
        //if your method doesnt require you to modify the object info
        //or use the object
        //and have a general ability to perfrom certain action not tied to any objects.
        System.out.println(String.format("Hello %s", "World"));
        int parsedInt = Integer.parseInt("245");
        String str = "Hello World";
        str.charAt(1);
        System.out.println(Animal.count);
        Animal animal2 = new Animal("Cat", "Garfield", 1, 0,'F', 9,true);
        System.out.println(animal2.countInstance);
        //so static references(variables and methods) can be called just by class name
        //whereas instance references require an object before calling them.
        //instance methods can call static variable or method
        Animal.printAllAllowedTypes();
    }
    static int a  = 0;
    int b = 0;
    public void print(){
        System.out.println(a);
    }
    public static void print2(){
        System.out.println();
    }
}
















