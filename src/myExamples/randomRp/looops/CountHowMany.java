package myExamples.randomRp.looops;

public class CountHowMany {
    public static void main(String[] args) {
        //word
        //char to count the number of occurrences

        String word = "computer programming";
        char myChar ='m';
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(myChar == word.charAt(i)){
                count++;
            }

        }
        System.out.println("Count: "+count);


    }
}
