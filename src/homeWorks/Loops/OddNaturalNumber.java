package homeWorks.Loops;

import java.util.Scanner;

public class OddNaturalNumber {
    public static void main(String[] args) {
        /*Write a program in Java to display the n terms of odd natural number and their sum.

                Test Data
        Input number of terms is: 5
        Expected Output :

        The odd numbers are :
        1
        3
        5
        7
        9
        The Sum of odd Natural Number up to 5 terms is: 25

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of terms is: ");
        int num = scan.nextInt();
        System.out.println("The odd numbers are : ");

        for(int i = 1; i < 10; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("The Sum of odd Natural Number up to " + num + " terms is: " + (num * num));
    }
}