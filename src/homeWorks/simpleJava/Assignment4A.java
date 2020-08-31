package homeWorks.simpleJava;

import java.util.Scanner;

public class Assignment4A {
    public static void main(String[] args) {
        /*Write a Java program to print the area and perimeter of a circle.
                Test Data:

        Note: The radius should be entered by keyboard.

                Formula:   Perimeter=2*radius*3.14;              Area=3.14*radius*radius;

        Radius = 7.5
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586

         */

        Scanner keyboard = new Scanner(System.in);
        double radius = keyboard.nextDouble();
        System.out.println("Perimeter is = "+(2*radius*3.14));
        System.out.println("Area is = "+(3.14*radius*radius));



    }
}
