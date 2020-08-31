package myExamples.randomRp.looops;

import java.util.Scanner;

public class ValidMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month;
        int i = 0;
        do {
            System.out.println("Enter a month: ");
            month = scan.nextInt();
        } while (month >= 1 && month <= 12);
        System.out.println("Invalid month - "+month);

    }
}

//creates a new partial string from existing string
//String word = "java"
//word.charAt(0)
//word.substring(0,2) => "ja"
//read first character from word:
//word.charAt(0) ==> 'j'

//word.substring
