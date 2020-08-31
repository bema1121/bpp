package homeWorks.simpleJava;

import java.util.Scanner;

public class Input5Numbers {
    public static void main(String[] args) {
       /* Write a program in Java to input 5 numbers
       from keyboard and find their sum and average.

      Test Data Input the 5 numbers : 1 2 3 4 5
        Expected Output :
        Input the 5 numbers :
        1
        2
        3
        4
        5
        The sum of 5 no is : 15
        The Average is : 3.0

        */


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the 5 numbers : ");

        int sum = 0;
        int i = keyboard.nextInt();;
        while(i >= 5){
           i+=i;
            System.out.println(i);
        }
        System.out.println("The sum of 5 no is : "+sum);

    }
}
