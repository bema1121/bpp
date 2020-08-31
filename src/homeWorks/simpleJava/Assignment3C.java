package homeWorks.simpleJava;

public class Assignment3C {
    public static void main(String[] args) {


        //Now we'll do even more typing of variables and printing them out.
        // Every time you put " (double-quotes) around a piece of text you have been making a String. A String is how you make something that your program might give to a human.


        // Please declare here the needed variables with the correct data types.

        String myName = "Zed A.Shaw";
        int myAge = 35;     // not a lie
        double myHeight = 74.5;  // inches
        double myWeight = 180.0; // lbs
        String myEyes = "Blue";
        String myTeeth = "White";
        String myHair = "Brown";

        System.out.println("Let's talk about " + myName + ".");
        System.out.println("He's " + myHeight + " inches tall.");
        System.out.println("He's " + myWeight + " pounds heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
        System.out.println("His teeth are usually " + myTeeth + " depending on the coffee.");

        // This line is tricky; try to get it exactly right.
        System.out.println("If I add " + myAge + ", " + myHeight + ", and " + myWeight
                + " I get " + (myAge + myHeight + myWeight) + ".");
    }
}

