package myExamples.arrayListProject;

import java.util.List;
import java.util.*;
public class SmallestDifference {
    public static void main(String[] args) {
        /*** Write a function that takes in two non-empty arrays of integers,*
         * finds the pair of numbers (one from each array) whose absolute difference is closest to zero,*
         * and returns an array containing these two numbers, with the number from the first array in the first position.*
         * You can assume that there will only be one pair of numbers with the smallest difference.*/

        List<Integer> listOne = Arrays.asList(-1, 5, 10, 20, 28, 3);
        List<Integer> listTwo = Arrays.asList(26, 134, 135, 15, 17);
        SmallestDifference smallestDifference = new SmallestDifference();
        List<Integer> result = smallestDifference.getSmallestDifference(listOne, listTwo);
        System.out.println(result);
    }

    public List<Integer> getSmallestDifference(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> middle = new ArrayList<>();
        int smallestOne = Integer.MAX_VALUE;

        Collections.sort(firstList);
        Collections.sort(secondList);

        int count = 0;
        int one = 0;
        int two = 0;
        int different;

        while (one < firstList.size() && two < secondList.size()) {
            int firstNumber = firstList.get(one);
            int secondNumber = secondList.get(two);
            if (firstNumber < secondNumber) {
                different = secondNumber - firstNumber;
                one++;
            } else if (firstNumber > secondNumber) {
                different = firstNumber - secondNumber;
                two++;
            } else {
                return Arrays.asList(firstNumber, secondNumber);
            }
            if (smallestOne > different) {
                smallestOne = different;
                middle = Arrays.asList(firstNumber, secondNumber);
            }
        }
        return middle;
    }
}