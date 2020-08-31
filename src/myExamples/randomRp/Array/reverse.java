package myExamples.randomRp.Array;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {4, 3, 2, 44, 1, 100};
        //int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        for (int i = 0; i <= nums.length/2; i++) {
            int temp = nums[i];
             nums[i] = nums[nums.length-i-1];
             nums[nums.length-i-1] = temp;
        }


        //Do not change below statement:
        System.out.println(Arrays.toString(nums));

    }
}

