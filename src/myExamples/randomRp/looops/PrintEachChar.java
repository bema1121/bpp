package myExamples.randomRp.looops;

public class PrintEachChar {
    public static void main(String[] args) {
        String word = "Amazon";
        //using for loop, print each char one by one
        //using for loop, print only consonants
        //using for loop, print only vowel(a,e,o,i,u)

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'u' || ch == 'o' || ch == 'i') {
                System.out.print(ch + ", ");

            }
        }
        System.out.println();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.toLowerCase().charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'u' || ch == 'o' || ch == 'i')) {
                System.out.print(ch + ", ");

            }

        }
    }
}