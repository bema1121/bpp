package sessions.classes_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserAnimalRequestService2 {
    public static void main(String[] args) {

        System.out.println("Employee APP");
        Scanner sc = new Scanner(System.in);
        //we are using the constructor that was designed in Animal class
        //creating = instantiating
        Animal dog1 = new Animal("Dog", "Labrador", 2, 0,'M', 12,false);
        Animal dog2 = new Animal("Dog", "Labrador", 3, 0,'F', 8,true);
        Animal dog3 = new Animal("Dog", "Labrador", 1, 'M',false);
        Animal dog4 = new Animal("Dog", "Pitbull", 1, 0,'F', 11,false);
        Animal dog5 = new Animal("Dog", "Pitbull", 2, 0,'F', 13,true);
        Animal dog6 = new Animal("Dog", "Pitbull", 4, 0,'M', 9,false);
        Animal cat1 = new Animal("Cat", "Garfield", 1, 0,'F', 7,true);
        Animal cat2 = new Animal("Cat", "Garfield", 1, 0,'M', 12,false);
        Animal cat3 = new Animal("Cat", "Garfield", 2,'M', false);
        Animal cat4 = new Animal("Cat", "Bengal", 1, 0,'M', 12,true);
        Animal cat5 = new Animal("Cat", "Bengal", 4, 0,'M', 12,false);
        //create this collection here so that it's accessible to user search.
        List<Animal> stock = new ArrayList<>();
        stock.add(dog1);
        stock.add(dog2);
        stock.add(dog3);
        stock.add(dog4);
        stock.add(dog5);
        stock.add(dog6);
        stock.add(cat1);
        stock.add(cat2);
        stock.add(cat3);
        stock.add(cat4);
        stock.add(cat5);
        //dog1.weight = -10;//There is no way weight can be negative.
        //there should be a way to disable users to give negative values to characteristics like
        //age, weight etc.
        //disallow gender change
        //gender is going to be read only.
        //no change allowed.
        //dog2.setGender('M');//Once the gender was created intially it should be able to be changed
        dog3.setType("Unknown");
        //the problem is that other classes have full access to instance variables thus they can modify the values of the instance variables
        //this gives users a full access to change the values of the instance variables.
        //Once you created an Object there must be control over the created characteristics.
        //Dog dd = new Dog();
        //2. Ask Client to input what they are looking for
        System.out.println("/////////////////////");
        System.out.println("User App");
        System.out.println("/////////////////////");
        //a. Animal Type
        System.out.println("Enter animal type");
        String type = sc.nextLine();
        //b. breed
        System.out.println("Enter " + type + " breed");
        String breed = sc.nextLine();
        //c. gender
        System.out.println("Enter gender");
        char gender = sc.nextLine().charAt(0);
        //Print out all animals info that match the request
        for (Animal animal : stock) {
            if (animal.getType().equalsIgnoreCase(type) && animal.getBreed().equalsIgnoreCase(breed) && animal.getGender() == gender){
                System.out.println(animal);//hashCode -> we dont have toString method in Animal class
            }
        }
    }
}
//Modify animal class so that User cannot create animals whose type is not dog, cat or rabbit or null.
//allow updating age to bigger value than what the age is already.
