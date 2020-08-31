package myExamples.randomRp.Array;

import java.util.Scanner;

public class ReverseSentenceArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Java is fun";

        String reversed = "";
        String[] arr = sentence.split(" ",4);

        for(int i = arr.length-1; i >= 0; i--){

            reversed += arr[i]+" ";
        }
        System.out.println(reversed);

    }
}

