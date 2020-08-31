package homeWorks.JavaMethods;

import java.util.Scanner;

public class TestPalindromicWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str2 = scanner.next();
        str2.equalsIgnoreCase(str2);
        System.out.println(isPalindrome(str2));

    }
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(i))
                return false;
            ++i;
            --j;
        }
        return true;

    }


}




