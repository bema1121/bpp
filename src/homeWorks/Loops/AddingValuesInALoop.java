package homeWorks.Loops;

import java.util.Scanner;

public class AddingValuesInALoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me.");
        int num = scanner.nextInt();
        int i = 0;
        int sum = 0;
        while (i < num) {
            if (num == 0) {
                break;
            }
            System.out.println("Number: ");
            num = scanner.nextInt();
            sum += num;
            i++;
            System.out.println("Total so far is " + sum);
        }
        System.out.println("Total is " + sum);

    }
}
