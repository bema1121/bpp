package myExamples.randomRp.looops;

import java.util.Scanner;

public class Guest {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String guestname = "";
        String guestList = "";
        String yesOrNo = "";

        do {
            System.out.println("Please enter guest name: ");
            guestname = input.next();
            guestList += guestname;
            System.out.println("Do you want to enter new guest name: ");
            yesOrNo = input.next();
        }while (yesOrNo == "yes");

            System.out.println("Guest's list: " + guestList);



        //System.out.println("Guest's list: "+guestList);


    }
}

