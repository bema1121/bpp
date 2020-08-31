package homeWorks.Loops;

import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] args) {
        /*Write a program in Java to display the cube of the number up to given an integer.

                Test Data
        Input number of terms : 4
        Expected Output :

        Number is : 1 and cube of 1 is : 1
        Number is : 2 and cube of 2 is : 8
        Number is : 3 and cube of 3 is : 27
        Number is : 4 and cube of 4 is : 64

     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of terms : ");
        int numOfTerm = scan.nextInt();
        for(int i = 1; i <= numOfTerm;i++){
            System.out.println("Number is : "+i+ " and cube of 1 is : "+i*i*i);


        }

    }
}
