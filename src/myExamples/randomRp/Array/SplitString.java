package myExamples.randomRp.Array;

public class SplitString {

    public static void main(String[] args) {

        String str = "I love Enes";
        String [] arr = str.split(" ");

        for(String a: arr){
            System.out.println(a);
        }
        //System.out.println(Arrays.toString(arr));

    }
}
