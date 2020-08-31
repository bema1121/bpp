package sessions.Loops;

import java.util.Scanner;

public class doWhile2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i;
        int j;
        boolean toContinue;


        do{
            System.out.println("Please Enter 2 positive numbers");
            i = in.nextInt();
            j = in.nextInt();
            System.out.println("Sum is: "+(i+j));
            System.out.println("Would you want to try again?");
            toContinue = in.nextBoolean();
        }while (toContinue);
    }
}
