package homeWorks.Loops;

import java.util.Scanner;

public class InputFiveNumbers {
    public static void main(String[] args) {

        System.out.println("Input the 5 numbers");
       int n = 0, sum =0;
        for(int i = 0; i< 5; i++){
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();

            sum+=n;
        }
        double average = sum/5;
        System.out.println("The sum of "+n+" no is : "+sum);
        System.out.println("The Average is : "+average);


    }
}
