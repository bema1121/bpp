package myExamples.randomRp.looops;

public class SubStringPravtise {
    public static void main(String[] args) {
        String word = "java";
        //System.out.println(word.substring(0,2)); //ja
        //print each character in separate line using
        //substring,

        //using for loop and substring, print each char
        //java
        //0123
        for(int n = 0; n <= 3; n++){
            //System.out.println(word.substring(n, n+1));
            String letter = word.substring(n, n+1);
            System.out.println(letter);

        }
        System.out.println("##########REVERSE########");

        for(int n = 3; n >= 0; n--){
            System.out.println(word.substring(n,n+1));
        }
        int start = 1;
        int end = 10;
                      //01234567891011
        String word2 = "UnitedStates";
        System.out.println(word2.substring(start,end));
        System.out.println(word2.substring(2, 3)); //i
        System.out.println(word2.substring(6, 7)); //S
        //pass single input. start only and will include until the last character
        System.out.println(word2.substring(6));
        //print last character

                      //01234
        String word3 = "apple";
        System.out.println(word3.substring(word3.length()-1));



    }
}
