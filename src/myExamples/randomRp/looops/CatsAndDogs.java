package myExamples.randomRp.looops;

public class CatsAndDogs {
    public static void main(String[] args) {
        String str = "mycatyourcat";
        //count how many cats
        int counter = 0;
        for(int i = 0; i < str.length()-3; i++){
            //System.out.println(str.substring(i,i+3));
//            String word = str.substring(i,i+3;
//            if(word.equals("cat")){
//                counter++;
            if(str.substring(i,i+3).equals("cat")){
                counter++;
            }

        }
        System.out.println("Cats: "+counter);
    }
}
//Homework:
//rewrite