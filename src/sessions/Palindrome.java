package sessions;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome("Hello"));
        System.out.println(p.isPalindrome("kayak"));
        System.out.println(p.isPalindrome("civic"));
        System.out.println(p.isPalindrome("Hannah"));
    }
    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }
        String temp = "";
        int i = input.length() - 1;
        while (i >= 0) {
            temp += input.charAt(i);
            i--;
        }
        return input.equals(temp);
    }
}






