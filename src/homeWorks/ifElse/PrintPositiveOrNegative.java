package homeWorks.ifElse;

import java.util.Scanner;

public class PrintPositiveOrNegative {
    public static void main(String[] args) {
       /* 1. Write a Java program to get a number from the user and print whether it is positive or negative.

                Test Data
        Input number: 35
        Expected Output :
        Number is positive

        */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num > 0){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is negative");
        }

    }
}
