package sessions.Loops;

import java.util.Scanner;

public class StringDoWhile {
    public static void main(String[] args) {



        /*
        Declare a variable that are used in the condition outside of the body loop
        Guest register
        when the name is entered store it
        if name is entered is empty end
        */
        System.out.println(guestRegister());


    }

    public static String guestRegister() {
        Scanner in = new Scanner(System.in);
        String listNames = "";
        String currentName;

        do {
            System.out.println("Enter guest's name: ");
            currentName = in.nextLine();
            if (currentName.length() > 0) listNames += currentName + ", ";

            else {
                listNames = listNames.substring(0, listNames.length() - 2) + ".";
            }
        } while (currentName.length() != 0);
        return listNames;

    }
    }
