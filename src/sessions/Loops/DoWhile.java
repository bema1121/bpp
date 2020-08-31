package sessions.Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        //there is a chance that while loop will not run at all
        boolean run = false;
        while (run) {
            System.out.println("Run Forest Run");

        }
        boolean run1 = false; //variable once created can be reassigned to a
        //new value
        //you can change the value of variable
        do {
            System.out.println("Run Forest Run[Do While]"); //body
        }
        while (run1);

        //write a program to print out "SDET" 10

        int n = 1;
        do {
            System.out.println("SDET" + n);
            n++;
        }
        while (n <= 10); //1 <= 10 //1 <= 10

        //print out "Study" infinite time

        int i = 10; //declared outside
        //update expression's role is to get the variable in test expression closer to being false
        while (i > 0) {
            System.out.println("Study");
            i--; //infinite loop bc value is 10 more than 0
        }

        //only difference between while and do while that do while runs the
        // body of loop at least once no matter what
        //atm => asks to enter password
        //if the password is right it will log you in
        //if the password is incorrect
        //ask for pass again
        //do this 3 times

        //please enter your password
        //2323
        //please enter your password
        //3455
        //please enter your password
        //3435


        int expectedPassword = 1234;
        Scanner scan = new Scanner(System.in);

        int password = 34;
        int count = 0;

        do {
            System.out.println("please enter your password");
            password = scan.nextInt(); //update statement ==> 2323
            count++;
        } while (expectedPassword != password && count < 3);

        if (expectedPassword == password ) {
            System.out.println("logged in");
        } else {
            System.out.println("Your account is blocked");

        }
        count=0;


        do {
            System.out.println("please enter your password");
            password = scan.nextInt(); //update statement ==> 2323
            if (expectedPassword != password ) {
                if(count >= 2){
                System.out.println("your are blocked");
                }
            } else {
                System.out.println("logged in");
            }
            count++;
        } while (expectedPassword != password && count < 3);



    }
}
