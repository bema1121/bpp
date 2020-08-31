package myExamples.codingBat;

import java.util.Scanner;

public class last3Char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Given a string, return a new string where the last 3 chars are
//        now in upper case. If the string has less than 3 chars, uppercase whatever is there.
//        Note that str.toUpperCase() returns the uppercase version of a string.
//
        String str = scan.next();
        String word = "";
        if (str.length() <= 3) {
            System.out.println(str.toUpperCase());
            System.out.println(str);
        } else if (str.length() >= 3)

            word = str.substring(str.length() - 3).toUpperCase();
        //String word2 = str.substring(0, str.length()-3) ;
        String word2 = str.replace(str.substring(str.length() - 3), word);
        System.out.println(word2);
    }

}

