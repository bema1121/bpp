package mentorings.Dan;

import java.util.Scanner;

public class SumPrint1To10 {
    public static void main(String[] args) {
//        int sum = 0;
//        for(int i = 1; i >= 10;i++){
//            //sum+=i;
//            System.out.printf("%d + %d = %d%n", sum, i, sum += i);
//
//        }

//        Write a program to enter the numbers till the user wants and at the
//        end the program should display the largest and smallest numbers entered.

        Scanner scan = new Scanner(System.in);

        int num ;
        int max = 0;
        int min = 0;
        String choice ="";
        do {
            System.out.println("Enter your number: ");
            num = scan.nextInt();
            if (num > max) {
                max = num;
            }
            if(num < min){
                min = num;
            }
            System.out.println("Would you like to enter another number? ");
            choice = scan.next().toLowerCase();

        }while (choice.equals("y"));
        System.out.println("The largest number is = "+max);
        System.out.println("The minimum number: "+min);

    }
}
