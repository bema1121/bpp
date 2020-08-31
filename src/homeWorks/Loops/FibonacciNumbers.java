package homeWorks.Loops;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        FibonacciNumbers fb = new FibonacciNumbers();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input : n = ");
        int num = scan.nextInt();
        System.out.println(fb.fibonacciNumbers(num));


    }

    public int fibonacciNumbers(int num) {
      int [] fibNumber = {0,1,1,2,3,5,8,13,21,34,55,89,114};
        for (int i = 0; i < num; i++) {
            if(num == i)
            ;



        }

        return num;


    }

}