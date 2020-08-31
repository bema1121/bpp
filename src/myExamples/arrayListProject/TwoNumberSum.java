package myExamples.arrayListProject;
import java.util.*;
public class TwoNumberSum {
    public static void main(String[] args) {
        /**
         * Write a function that takes in a non-empty list of distinct integers, and an integer representing target sum.
         * If any two numbers in the input list sum up to the target sum, the function should return them in a list, in any order.
         * If no two numbers sum up to the target sum, the function should return an empty list;
         */
        List<Integer> list = Arrays.asList(3, 5, -4, 8, 11, 1, -1, 6);
        int targetSum = 10;
        TwoNumberSum twoNumberSum = new TwoNumberSum();
        List<Integer> noDuplicateList = twoNumberSum.removeDuplicates(list);
        List<Integer> twoNumbers = twoNumberSum.find(noDuplicateList, targetSum);
        System.out.println(twoNumbers);
    }

    public List<Integer> removeDuplicates(List<Integer> numbers) {

        List <Integer> removedList = new ArrayList<>(numbers);
        Set <Integer> removeD = new LinkedHashSet<>(removedList);
        removedList.clear();
        removedList.addAll(removeD);
        return removedList;


    }

    public List<Integer> find(List<Integer> numbers, int targetSum) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int firstNum = numbers.get(i);
            for (int j = i + 1; j < numbers.size(); j++) {
                int secondNum = numbers.get(j);
                if (firstNum + secondNum == targetSum) {
                    list = Arrays.asList(firstNum, secondNum);
                }
            }
        }
        return list;
    }
}






