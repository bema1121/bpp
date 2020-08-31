package homeWorks.Arrays;

import java.util.Scanner;

public class CountVowelDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scan.next();
        countVowelDigits(str);
    }public static void countVowelDigits(String str) {
        double count = 0;
        double count2= 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
                continue; } }
        System.out.println("Number of vowels: "+count+" ("+(count*100)/str.length()+"%)");
        for(int i = 1; i < str.length(); i++) {
            if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {
                count2++;
               continue;
            } }
        System.out.println("Number of digits: " + count2+" ("+(count2*100)/str.length()+"%)");

    }
}