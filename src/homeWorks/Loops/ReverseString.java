package homeWorks.Loops;

public class ReverseString {
    public static void main(String[] args) {
//        Write a program called ReverseString, which prompts user for a String,
//        and prints the reverse of the String by extracting and processing each character.
//        The output shall look like:
//
//        Enter a String: abcdef
//        The reverse of the String "abcdef" is "fedcba".

        String alphabet = "abcdef";
        String reversedName = "";
        int num = alphabet.length();

        while(num > 0){
            reversedName = reversedName +alphabet.charAt(num-1)+"";
            num--;
        }
        System.out.println(reversedName);


    }



    }

