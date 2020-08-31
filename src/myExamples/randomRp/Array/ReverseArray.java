package myExamples.randomRp.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {4, 3, 2, 44, 1, 100, 55};
        //int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int []temp = new int[7];
        for(int i = nums.length-1; i > 0; i--){
            temp[i] = nums[i];
            //System.out.println(nums[i]);
         }

        System.out.println(Arrays.toString(temp));

    }


}


