package homeWorks.Loops;

import java.util.Scanner;

public class TAskHomework {
    public static void main(String[] args) {

        int i = 0;
        int j = 1;
        int sum = 0;
       // boolean stop

        while (j > i) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Number: ");

            j = scanner.nextInt();
            sum += j;
            System.out.println(sum);
        }
        System.out.println("Total " + sum);
    }
}
