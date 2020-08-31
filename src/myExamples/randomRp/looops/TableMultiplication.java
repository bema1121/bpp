package myExamples.randomRp.looops;

import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args) {

//        Write a program that prompts the user to input a positive integer.
//        It should then print the multiplication table of that number.
//        Example:
//        Enter any positive integer: 3
//
//        Output:
//        3 x 1 = 3
//        3 x 2 = 6
//        3 x 3 = 9
//        3 x 4 = 12
//        3 x 5 = 15
//        3 x 6 = 18
//        3 x 7 = 21
//        3 x 8 = 24
//        3 x 9 = 27
//        3 x 10 = 30

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any positive integer: ");
        int num = scan.nextInt();

       for(int num2 = 1;num2 <= 10; num2++) {
           System.out.println(num + " x " + num2 + " = " + (num * num2));
       }
        int num2 = 1;
        while(num2 <= 10){
            System.out.println(num+" x "+num2+" = "+(num*num2));
            num2++;

        }



    }}