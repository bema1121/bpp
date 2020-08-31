package mentorings.Dan;

public class findSecondLargest {
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 2, 3};
        System.out.println(secondLargestNumber(nums));
        //secondLargestNum(new int[] {2,11,6,9,10,1});

    }
    public static int secondLargestNumber(int[] nums) {
        int secondMax = 0;
        int max;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    secondMax = nums[i];
                    nums[i] = nums[j];
                    nums[j] = secondMax;
                } }
        }
        return nums[nums.length - 2];

    }}

//    public static int secondLargestNum(int[] nums){
//        int firstLargest;
//        int secondLargest;
//        /*
//        checking first two element of num Array
//         */
//        if(nums[0] > nums[1]){
//            //if 1st element is greater than 2nd element
//            firstLargest = nums[0];
//            secondLargest = nums[1];
//        }else{
//            //if 2nd element is greater than 1st element
//            firstLargest = nums[1];
//            secondLargest = nums[0];
//
//        }
//        for(int i = 2; i < nums.length; i++){
//            if(nums[i] > firstLargest){
//                secondLargest = firstLargest;
//                firstLargest = nums[i];
//            } else if (nums[i] < firstLargest && nums[i] > secondLargest) {
//                // if element at [i] is smaller then firstLargest and greater
//                // than seconLargest
//                secondLargest = nums[i];
//            }
//        }
//        return secondLargest;








