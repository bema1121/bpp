package homeWorks.ifElse;

import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {

        /**
         *  Write a Java program to compare two numbers.
         *         Input Data:
         *         Input first integer: 25
         *         Input second integer: 39
         *         Expected Output
         *
         *
         *         25 < 39     or       39 > 25        or       "The fist number is smaller"
         */

        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        // 25 > 39      39>25
        if (n1 < n2) {
            System.out.println("The " + n1 + " is smaller than " + n2);

        } else if (n2 < n1) {
            System.out.println("The " + n2 + " smaller than " + n1);
        } else {
            System.out.println("Two numbers are equal");
        }

    }
}
