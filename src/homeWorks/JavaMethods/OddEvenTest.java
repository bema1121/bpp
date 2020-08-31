package homeWorks.JavaMethods;

import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        OddEvenTest isOddEvenTest = new OddEvenTest();
      boolean oddOrEven =  isOddEvenTest.isOdd(num);
        System.out.println(oddOrEven);
    }

    public boolean isOdd(int number) {
        boolean result = false;
        if (number % 2 == 1) {
            result = true;
            System.out.println(number+" is odd number");
            return result;

        } else if (number % 2 == 0) {
            result = false;
           System.out.println(number+" is even number");
            return result;

        } else {
            return result;
        }
    }
}

