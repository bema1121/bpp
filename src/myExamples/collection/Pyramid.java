package myExamples.collection;

import java.util.ArrayList;
import java.util.List;

public class Pyramid {
    public static void main(String[] args) {

        /**
         * Write a java function that returns lines of stars
         * so that when it is printed out, it displays a Pyramid
         *
         * ex: This list of stars will return a pyramid once it is print out line by line
         * [         * ,         * * ,        * * * ,       * * * * ,      * * * * * ,     * * * * * * ,    * * * * * * * ,   * * * * * * * * ,  * * * * * * * * * , * * * * * * * * * * ]
         *
         * output:
         *          *
         *         * *
         *        * * *
         *       * * * *
         *      * * * * *
         *     * * * * * *
         *    * * * * * * *
         *   * * * * * * * *
         *  * * * * * * * * *
         * * * * * * * * * * *
         *
         */
        printStars(10).forEach(System.out::println);
    }
    public static List<String> printStars(int n) {
        List<String> star = new ArrayList<>();
        String str ="";

        for(int i = 0; i < n; i++){
            str = "";
            for(int j = i; j < n; j++){
                str +=" ";
            }
            for(int a = 0; a <= i; a++){
               str += "* ";
            }
            star.add(str);
        }



        return star;
    }
}


