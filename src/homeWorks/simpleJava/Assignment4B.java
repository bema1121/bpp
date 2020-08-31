package homeWorks.simpleJava;

import java.util.Scanner;

public class Assignment4B {
    public static void main(String[] args) {
       /* Write a Java program and compute the sum of the digits of an integer.
          Hint: to find the remainder in this example last digit you should use % symbol
          to find the first digit you should use / symbol.
            Input Data:
        Input an integer: 25
        Expected Output
        The sum of the digits is: 7

        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int digits = scan.nextInt();

        int firstNum = digits / 10;
        int secondNum = digits % 10;
        int totalNum = firstNum + secondNum;
        System.out.println("Sum of the digits is: " + totalNum );





        //System.out.println(num%2/num);

    }
}
