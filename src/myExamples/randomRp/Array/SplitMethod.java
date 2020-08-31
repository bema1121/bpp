package myExamples.randomRp.Array;

public class SplitMethod {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String sentence = input.nextLine();
        String sentence = "Java is fun";
        String[] arr = sentence.split(" ");

        for (int i = 0; i <= arr.length-1; i++) {
            System.out.println(arr[i]);
        }


    }
}