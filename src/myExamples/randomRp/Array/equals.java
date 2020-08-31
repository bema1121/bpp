package myExamples.randomRp.Array;

import java.util.Scanner;

public class equals {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int counter =0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }
}

