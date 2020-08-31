package homeWorks.Loops.NestedLoop;

import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scanner.nextInt();

        checkerPattern(size);


    }
    public static void checkerPattern(int size){

        for(int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row % 2) == 0) {
                    //row+=col;
                    System.out.print(" ");
                     //continue;
                }
                //System.out.print(" ");
                System.out.print(" # ");



            }
            System.out.println();
           }


    }
}