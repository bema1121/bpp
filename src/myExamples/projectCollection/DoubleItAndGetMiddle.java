package myExamples.projectCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleItAndGetMiddle {
    public static void main(String[] args) {
        /**
         * 1)Create a function so that it doubles items in the list
         * Call this function and print them out
         * ex:
         * if the parameter is
         * (1,5,3,7)
         * return
         * [1, 1, 5, 5, 3, 3, 7, 7]
         *
         * 2)Create another function so that it retrieves two middle items from the doubled list
         * Call this function and print them out
         * ex:
         * return
         * [5, 3]
         */
        List<Integer> numbers = Arrays.asList(1, 5, 3, 7);
        //TODO write your code here
        DoubleItAndGetMiddle doubleItAndGetMiddle = new DoubleItAndGetMiddle();
        List<Integer> doubleNumbers = doubleItAndGetMiddle.getDouble(numbers);
        System.out.println(doubleNumbers);
        List<Integer> middleNumbers = doubleItAndGetMiddle.getMiddle(doubleNumbers);
        System.out.println(middleNumbers);
    }



    public List<Integer> getDouble(List<Integer> numbers) {
        List<Integer> doubleList = new ArrayList<>();
        for (int i = 0; i < numbers.size();i++) {
            doubleList.add(numbers.get(i));
            doubleList.add(numbers.get(i));

        }    //TODO implement this method
        return doubleList;
    }

        public List<Integer> getMiddle(List<Integer> numbers) {
            List<Integer>midd = new ArrayList<>();
            int middle2 = numbers.size()/2 ;
            midd.add(numbers.get(middle2-1));
            midd.add(numbers.get(middle2));

            //TODO implement this method
        return midd;
    }
}
