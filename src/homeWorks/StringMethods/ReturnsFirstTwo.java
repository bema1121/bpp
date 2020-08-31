package homeWorks.StringMethods;

import java.util.Scanner;

public class ReturnsFirstTwo {
    public static void main(String[] args) {
        /*Given a string, return the string made of its first two chars,
        so the String "Hello" yields "He". If the string is shorter than length 2,
        return whatever there is, so "X" yields "X", and the empty string "" yields
        the empty string "". Note that str.length() returns the length of a string.
        firstTwo("Hello") → "He"
        firstTwo("abcdefg") → "ab"
        firstTwo("ab") → "ab"

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = scan.next();
        ReturnsFirstTwo firstChar = new ReturnsFirstTwo();
        System.out.println(firstChar.firstTwo(str));
    }
    public String firstTwo(String str){
        if(str.length() == 2){
           return str;
        }else if(str.length() > 2){
            return str.substring(0,2);
        }else{
            return str;

        }
    }
}
