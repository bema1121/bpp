package homeWorks.simpleJava;

public class Assignment2B {
    public static void main(String[] args) {
       /* Write a Java program to print the result of the following operations.
        Test Data:

        a. -5 + 8 * 6   // you should declare first data types ==> int  a=-5; int b=8; c=6 ;    int result=a+b*c; System.out.println(result);
        b. (55+9) % 9                                // try to declare data type first and print out the result
        c. 20 + -3*5 / 8                             // try to declare data type first and print out the result
        d. 5 + 15 / 3 * 2 - 8 % 3                // try to declare data type first and print out the result


        Expected Output :
        43
        1
        19
        13

        */
        int a = -5;
        int b = 8;
        int c = 6;
        int result = a + b * c;
        System.out.println(result);

        int a1 = 55;
        int b1 = 9;
        int c1 = 9;
        int result1 = (a1 + b1) % c1;
        System.out.println(result1);

        int a2 = 20;
        int b2 = -3;
        int c2 = 5;
        int d = 8;
        int result2 = a2+b2*c2/d;
        System.out.println(result2);

        int a3 = 5;
        int b3 = 15;
        int c3 = 3;
        int d1 = 2;
        int d2 = 8;
        int d3 = 3;
        int result3 = a3+b3/c3*d1-d2%d3;
        System.out.println(result3);


    }
}
