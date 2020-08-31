package sessions.JavaMethods;

public class Vowel {

    public static boolean vowel (char c){
        return "aeiouAEIOU".indexOf(c) >= 0;
    }

    public static void printMessage(boolean isVowel){
        if(isVowel){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        boolean isVowel = vowel('a');
        printMessage(isVowel);

        boolean isVowel2 = vowel('b');
        printMessage(isVowel2);
    }
}
