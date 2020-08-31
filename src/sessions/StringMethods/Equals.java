package sessions.StringMethods;

import java.util.Scanner;

public class Equals {
    //equals => compare if two strings contain exact the same
    //characters. Note: Comparing the values of String
    public static void main(String[] args) {
        String str = "Hello";
        boolean isEqual = str.equals("Hello");
        System.out.println(isEqual);

        //write a program which tells me which side of the desk
        //student should sit.
        //if left handed then sit on the left side
        //if right handed then sit on the right Side
        //if both take the full desk

        //equals() can be used to validate user's input
        Scanner sc = new Scanner(System.in);
        System.out.println("Which hand is your strongest?");

        String hand = sc.next();


        if(hand.equals("right")){
            System.out.println("Sit on the right side of the desk");
        }else if(hand.equals("left")){
            System.out.println("Sit on the right side of the desk");
        }else if(hand.equals("left and right")){
            System.out.println("take the full desk");
        }else{
            System.out.println("Not valid input");
        }

        System.out.println("What is your name");
        String name = sc.nextLine();
        System.out.println(name+" do you want to enter your full address?");

        System.out.println("What is your full address?");

        String yesOrNo = sc.next();
        if(yesOrNo.equals("yes")){
            System.out.println("Please enter your full address");
            String address = sc.nextLine();
        }else if(yesOrNo.equals("no")){
            System.out.println("We appreciate your business with us");
        }else{
            System.out.println("Invalid Input");
        }





    }
}
