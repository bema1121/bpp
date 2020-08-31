package homeWorks.StringMethods;

import java.util.Scanner;

public class returnFirstHalf {
    public static void main(String[] args) {
       /* Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


                firstHalf("WooHoo") → "Woo"
        firstHalf("HelloThere") → "Hello"
        firstHalf("abcdef") → "abc"
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the word: ");
        String str = scan.next();

        if(str.length() % 2 == 0){
            System.out.println(str.substring(0,str.length()/2));

        }else{
            System.out.println("This is a odd word: "+str);
        }


    }
}
