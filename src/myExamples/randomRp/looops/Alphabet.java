package myExamples.randomRp.looops;

import java.util.Scanner;

public class Alphabet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input an alphabet:");
        String str = input.next();
        if (str.length() == 1) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                        || str.charAt(i) == 'i' || str.charAt(i) == 'y' || str.charAt(i) == 'u' || str.charAt(i) == 'o') {
                    System.out.println("Input letter is Vowel");
                } else {
                    System.out.println("Input letter is Consonant");
                }

            }
        } else {
            System.out.println("ERROR. It should be exactly 1 character length!");
        }


    }
}

