package myExamples.randomRp.looops;

public class LookForWordInString {
    public static void main(String[] args) {
        String sentence = "He said hi, then she replied hi. hi guys!";
        int counter = 0;
        for(int i = 0; i < sentence.length()-1; i++){
            //System.out.println(sentence.substring(i,i+2));
            String str2 = sentence.substring(i,i+2);
            if(str2.equals("hi")){
                counter++;

            }
        }
        System.out.println("Count: " +counter);
    }
}
