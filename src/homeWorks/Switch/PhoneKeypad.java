package homeWorks.Switch;

import java.util.Scanner;

public class PhoneKeypad {
    public static void main(String[] args) {
        /*On your phone keypad, the alphabets are mapped to digits as follows: ABC(2),
        DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9). Write a program called PhoneKeyPad,
        which prompts user for a String (case insensitive), and converts to a sequence of keypad digits.
        Use (a) a nested-if, (b) a switch-case-default.

        Hints
        You can use in.next().toLowerCase() to read a String and convert it to lowercase to reduce your cases.
                In switch-case, you can handle multiple cases by omitting the break statement, e.g.,
                switch (inChar) {
                    case 'a': case 'b': case 'c':  // No break for 'a' and 'b', fall thru 'c'
                        System.out.print(2); break;
                    case 'd': case 'e': case 'f':
      ......
                    default:
      ......
                }

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter: ");
        String str = scan.next().toUpperCase();


        switch(str) {
            case "A":
            case "B":
            case "C":
                System.out.println("2");
                break;
            case "D":
            case "E":
            case "F":
                System.out.println("3");
                break;
            case "G":
            case "H":
            case "I":
                System.out.println("4");
                break;
            case "J":
            case "K":
            case "L":
                System.out.println("5");
                break;
            case "M":
            case "N":
            case "O":
                System.out.println("6");
                break;
            case "P":
            case "Q":
            case "R":
            case "S":
                System.out.println("7");
                break;
            case "T":
            case "U":
            case "V":
                System.out.println("8");
                break;
            case "W":
            case "X":
            case "Y":
            case "Z":
                System.out.println("9");
                break;
            default:
                System.out.println("Incorrect input: ");


        }}}