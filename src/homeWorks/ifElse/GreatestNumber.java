package homeWorks.ifElse;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        /*Take two numbers from the user and print the greatest number.

                Test Data
        Input the 1st number: 25
        Input the 2nd number: 87
        Expected Output :
        The greatest: 87

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Input th 1st number: ");
        int num1 = scan.nextInt();
        System.out.println("Input the 2nd number: ");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println("The greatest: "+num1);
        }else if(num2 > num1){
            System.out.println("The greatest is: "+num2);
        }
    }
}
