package homeWorks.ifElse;

import java.util.Scanner;

public class TakeThreeNumbers {
    public static void main(String[] args) {
       /* Take three numbers from the user and print the greatest number.

                Test Data
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
        Expected Output :
        The greatest: 87

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the 1st number: ");
        int num1 = scan.nextInt();
        System.out.println("Input the 2nd number: ");
        int num2 = scan.nextInt();
        System.out.println("Input the 3rd number: ");
        int num3 = scan.nextInt();

        if(num1 > num2 && num1 > num1){
            System.out.println("The greatest is: "+num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("The greatest is: "+num2);
        }else if(num3 > num1 && num3 > num2){
            System.out.println("The greatest is: "+num3);
        }

    }
}
