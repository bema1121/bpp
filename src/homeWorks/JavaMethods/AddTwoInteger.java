package homeWorks.JavaMethods;

import java.util.Scanner;

public class AddTwoInteger {
    public static void main(String[] args) {
        AddTwoInteger twoInteger = new AddTwoInteger();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int n1 = input.nextInt();

        System.out.println("Enter second integer: ");
        int n2 = input.nextInt();

        int sum = twoInteger.add2integers(n1,n2);
        System.out.println("Sum is: "+sum);


    }
    public int add2integers(int num1,int num2){
        int result = 0;
        result = num1+num2;
        return result;
    }

    }

    /*Write a method called add2Integers(8,9) that prompts user to enter two integers.
    The program shall read the two integers as int; compute their sum; and print the result.
     For example,

    Enter first integer: 8
    Enter second integer: 9
    The sum is: 17
*/




