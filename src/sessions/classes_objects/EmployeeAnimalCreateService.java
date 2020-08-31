package sessions.classes_objects;
//1. class can be used to create a structure for maintaining information.
//2. class can be used to accomplish some tasks.

import java.util.Scanner;

//Utility class - is a class with bunch of static methods that accomplish certain tasks.
/**
 * this class is responsible for creating animals
 * and adding to the stock.
*/

public class EmployeeAnimalCreateService {

    //method
    //get info for the animal and create and animal object and return that animal

    //access modifier return type(Animal, String, List<String>, int, double)
    //Classes can be used as the return type since every class is a data type by itself.
    //int
    //String
    //List<String>
    //double
    //Animal
    //Person
    //Dog

    public static Animal createAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Animal type");
        String type = sc.nextLine();

        //enter dog breed
        System.out.println("Enter " + type + " breed");
        String breed = sc.nextLine();

        //age
        System.out.println("Enter age");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter duration");
        int duration = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter gender(F/M)");
        char gender = sc.nextLine().charAt(0);

        System.out.println("Enter weight");
        double weight = sc.nextDouble();
        sc.nextLine();

        System.out.println("Is animal injured(true/false)");
        boolean isInjured = sc.nextBoolean();

        Animal animalFromEmployee = new Animal(type, breed, age, duration, gender, weight, isInjured);
        return animalFromEmployee;
    }
    public static Animal createAnimalWithoutDurationAndWeight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Animal type");
        String type = sc.nextLine();

        //enter dog breed
        System.out.println("Enter " + type + " breed");
        String breed = sc.nextLine();

        //age
        System.out.println("Enter age");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter gender(F/M)");
        char gender = sc.nextLine().charAt(0);

        System.out.println("Is animal injured(true/false)");
        boolean isInjured = sc.nextBoolean();

        Animal animalFromEmployee = new Animal(type, breed, age, gender, isInjured);

        return animalFromEmployee;
    }


}
