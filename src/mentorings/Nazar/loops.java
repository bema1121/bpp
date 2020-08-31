package mentorings.Nazar;

public class loops {
    public static void main(String[] args) {

    }

    public static String rev(String s) {
        String reversed = "";
        //The same number of iterations as the length of a string
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;

    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i <= str.length() / 2; i++) {
            char c1 = str.charAt(i); //character from the front of a String
            char c2 = str.charAt(str.length() - 1 - i); //character from the back of the String
            if (c1 != c2)
                return false;
        }
        return true;

    }}