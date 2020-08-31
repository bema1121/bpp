package homeWorks.ifElse;

import java.util.Scanner;

public class InputTwoIntegers {
    public static void main(String[] args) {
        /*Write a Java program that accepts two integers from the user and
        then prints the sum, the difference, the product, the average, the distance
        (the difference between integer), the maximum (the larger of the two integers),
        the minimum (smaller of the two integers).

         Test Data
        Input 1st integer: 25
        Input 2nd integer: 5

        Expected Output :
        Sum of two integers: 30
        Difference of two integers: 20
        Product of two integers: 125
        Average of two integers: 15.00
        Distance of two integers: 20
        Max integer: 25
        Min integer: 5

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 1st integer: ");
        int num1 = scan.nextInt();
        System.out.println("Input 2nd integer: ");
        int num2 = scan.nextInt();

        System.out.println("Sum of two integers: "+(num1+num2));
        System.out.println("Difference of two integers: "+(num1-num2));
        System.out.println("Product of two integers: "+(num1*num2));
        System.out.println("Average of two integers: "+(num1+num2)/2);
        System.out.println("Distance of two integers: "+(num1-num2));
        System.out.println("Max integer: "+num1);
        System.out.println("Min integer: "+num2);

    }
}
