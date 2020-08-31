package myExamples.randomRp.looops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "amazon";
        char letter = 'a';
        int index = -1;

        //using for loop and look for the letter
        //if it is a match assign value to index
        //exit for loop
        //print value of index

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == letter){
                index = i;
                break;
            }
        }
        System.out.println("Index of character: "+index);

    }
}
