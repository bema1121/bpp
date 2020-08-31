package myExamples.randomRp.Array;

import java.util.Scanner;

public class nums {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
            int n = 0;
            int m = 0;
            for(int i = 0; i < nums.length-1; i++){
                if(nums[i] == nums[i+1]){
                    n = nums[i];

                }else{
                    m = nums[i];
                }

            }
            System.out.println(m);



        }
    }

