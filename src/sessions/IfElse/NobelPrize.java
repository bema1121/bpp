package sessions.IfElse;

import java.util.Scanner;

public class NobelPrize {
    public static void main(String[] args) {
        //write a program which will tell me if I qualify
        // for Nobel Prize

        //ONE QUALIFIES for nobel prize when
        //doesSignificantWork
        //  is nobelPrize candidate

        //ask user did you do significant work?
        //did are a nobelPrizeCandidate

        //To be a candidate for a nobel prize I have to
        //do significant work and make a break through


        Scanner input = new Scanner(System.in);

        System.out.println("Did you do significant work?");
        boolean doesSignificantWork = input.nextBoolean();

        System.out.println("Did you make BreakThrough? ");
        boolean makesBreakthrough = input.nextBoolean();

        boolean nobelPrizeCandidate = false;

        if (doesSignificantWork && makesBreakthrough) {
            nobelPrizeCandidate = true;

//        else {
//            nobelPrizeCandidate = false;
        }
        System.out.println("Is the user a nobel prize candidate? "+nobelPrizeCandidate);

        //if user is a candidate then wish a good luck
        //otherwise wish to keep chasing his/her goal

        if(nobelPrizeCandidate){
            System.out.println("Good Luck");
        }else{
            System.out.println(" Keep chasing your goal");
        }

    }
}

