package homeWorks.Loops;

import java.util.Scanner;

public class Exponent {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the exponent: ");
            int exp = scanner.nextInt();
            System.out.println("Enter the base: ");
            int base = scanner.nextInt();   // base (integer)

            // Print result
            System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
        }


        public static int exponent(int base, int exp) {
            int product = 1;

            for (int i = 0; i < base; i++) {
                product *= base;


            }

            return product;
        }
    }

