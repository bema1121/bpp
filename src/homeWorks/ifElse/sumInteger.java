package homeWorks.ifElse;

import java.util.Scanner;

public class sumInteger {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);


//        Write a Java program to calculate the sum of two integers and
//        return true if the sum is equal to a third integer.
//
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true
        System.out.println("Enter first number: ");
        int n1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int n2 = scan.nextInt();
        System.out.println("Enter sum of these two numbers: ");
        int n3 = scan.nextInt();

        int sum = n1 + n2;
        boolean result=false;

       if(sum == n3){
           result  = true;

           System.out.println("The result is "+ result);
       }else{
            System.out.println("The result is "+ result);
        }


    }
}
