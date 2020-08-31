package sessions.IfElse;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
//        Write a program which will tell me If I can sleep.
//                isWeekday  -- isVacation
//        We sleep in if it is not a weekday or we’re on vacation.

        Scanner scan = new Scanner(System.in);
        System.out.println("Is it a weekday?");
        boolean isWeekday = scan.nextBoolean();
        System.out.println("Are you on Vacation?");
        boolean isVacation = scan.nextBoolean();

        if(!isWeekday || isVacation){
            System.out.println("You can sleep ");
        }else{
            System.out.println("Get up and code");
        }
    }

}
