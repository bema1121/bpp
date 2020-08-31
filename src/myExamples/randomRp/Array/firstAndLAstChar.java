package myExamples.randomRp.Array;

import java.util.Arrays;

public class firstAndLAstChar {
    public static void main(String[] args) {
        String[] words = {"hello", "why", "by", "apple", "note"};
        String temp = "";
        //String[] arr = new String[words.length];
        for(int i = 0; i < words.length; i++){
           // System.out.println(words[i].charAt(0+words[i].length()-1));
            temp = words[i].charAt(0)+"";
            temp += words[i].charAt(words[i].length()-1)+"";
            //arr[i] = temp;
            System.out.println(temp);
        }








    }public static void wordss () {
            String[] words = {"hello", "why", "by", "apple", "note"};

            String temp = "";
            String[] arr = new String[words.length];
            for (int i = 0; i < words.length; i++) {
                temp = words[i].charAt(0) + "";
                temp += words[i].charAt(words[i].length() - 1) + "";
                arr[i] = temp;

            }
            System.out.println(Arrays.toString(arr));


        }



    }

