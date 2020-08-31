package sessions.Loops;

import java.util.Scanner;

public class DoWhi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;

        do{
            System.out.println("Please enter a positive number");
            i = in.nextInt();
        }while ( i <= 0);

        //After loop
        System.out.println(i);

        }
    }

