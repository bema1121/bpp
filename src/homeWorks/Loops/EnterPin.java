package homeWorks.Loops;
import java.util.Scanner;
public class EnterPin {

//    1) while loop similar to if statement => they are both check if the expression true or false, if it's false it will not the run body of the code.
//
//            2) if is for comparison and it will run once, while will execute the block of code until condition is true.
//
//            3) we have already declared the entry = keyboard.nextInt();
//
//4) if we delete the entry = keyboard.nextInt(); if we put incorrect password it will run infinite, if we put the correct one it will execute the body


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;

        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();

        while (entry != pin) {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            //entry = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    }
}

