package myExamples.randomRp.looops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = scan.nextInt();
        //check if it is valid
        //if it not valid return
        //for loop to print multiplication table

        if(num > 10 || num < 1){
            System.out.println("ERROR: Invalid Input  ");

        }

        for(int i = 1; i <= 10; i++) {
            System.out.println(num+ " x " +i+ " = " +(num*i));
            }

        }
    }

