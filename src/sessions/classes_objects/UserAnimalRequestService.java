package sessions.classes_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserAnimalRequestService {

    public static void main(String[] args) {

        System.out.println("Employee APP");
        Scanner sc = new Scanner(System.in);
        //create this collection here so that it's accessible to user search.
        List<Animal> stock = new ArrayList<>();
        //Populate our stock
        //1. Call createAnimal method to create animals.
        //add the animal to the list of animals(stock)
        String answer;
        do {
            System.out.println("Do you have duration and weight(true/false)");
            boolean hasDurationAndWeigth = sc.nextBoolean();
            sc.nextLine();
            if (hasDurationAndWeigth) {
                Animal animalCreated = EmployeeAnimalCreateService.createAnimal();
                stock.add(animalCreated);
            }
            else {
                Animal animalCreated = EmployeeAnimalCreateService.createAnimalWithoutDurationAndWeight();
                stock.add(animalCreated);
            }
            System.out.println("Are you done?");
            answer = sc.nextLine();
        }while (!answer.equalsIgnoreCase("done"));
        //do above until user says done
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
//All about maintaining the information.
