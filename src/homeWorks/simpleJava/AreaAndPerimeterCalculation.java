package homeWorks.simpleJava;

import java.util.Scanner;

public class AreaAndPerimeterCalculation {
    public static void main(String[] args) {
        /*Write a Java program to print the area and perimeter of a rectangle.
        The width and height should be entered from
        Test Data:
        Note: The width and height should be entered by keyboard.
         Width = 5.5 Height = 8.5

        Expected Output
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20
        */
        Scanner keyboard = new Scanner(System.in);

        double width = keyboard.nextDouble();
        double height = keyboard.nextDouble();

        System.out.println("Area is " + (width * height));
        System.out.println("Perimeter is " + (2 * (width + height)));


    }
}
