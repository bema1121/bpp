package homeWorks.ifElse;

import java.util.Scanner;

public class ageMessage3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.next();

        System.out.println("Please enter your age: ");
        int age = scan.nextInt();

        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);

        if (age < 16) {
            System.out.println("You can't drive");
        }
        if (age == 16 || age == 17) {
            System.out.println("You can drive but not to vote, " + name);
        }
        if (age >= 18 && age <= 24) {
            System.out.println("You can vote but not rent a car, " + name);
        }
        if (age >= 25) {
            System.out.println("You can do pretty much everything, " + name);
        }
    }
}
