package homeWorks.Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*Write a program in Java to display the multiplication table of a given integer.

        Test Data
        Input the number (Table to be calculated) : Input number of terms : 5
        Expected Output :

        5 X 0 = 0
        5 X 1 = 5
        5 X 2 = 10
        5 X 3 = 15
        5 X 4 = 20
        5 X 5 = 25

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number: ");
        int num = scan.nextInt();

        for(int i = 0; i <= num;i++ ){
            System.out.println(num+ " X "+i+ " = "+num*i);
        }


    }
}
