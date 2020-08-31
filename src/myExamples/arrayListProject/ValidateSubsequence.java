package myExamples.arrayListProject;
import java.util.*;
public class ValidateSubsequence {
    public static void main(String[] args) {
        /**
         * Given two non-empty arrays of integers,
         * write a function that determines whether the second array is a subsequence of the first one.
         * A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array,
         * but that are in the same order as they appear in the array.
         * ex: the numbers [1,3,4] form a subsequence of the array [1,2,3,4], and so do the numbers [2,4].
         * Note: a single number in an array, and the array itself are both valid subsequence of the array.
         */
        ValidateSubsequence validateSubsequence = new ValidateSubsequence();
        List<Integer> array = Arrays.asList(1, 2, 3, 4);
        List<Integer> sequence = Arrays.asList(1, 3, 4);
        boolean isValid = validateSubsequence.isValidSubsequence(array, sequence);
        System.out.println("Is this a valid sequence: " + isValid);
    }

    private boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        return false;
    }
}
