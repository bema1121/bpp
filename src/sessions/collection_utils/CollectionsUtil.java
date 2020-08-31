package sessions.collection_utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<String> shirts = new ArrayList<>(Arrays.asList("XL", "S", "M", "M", "M", "S", "L", "XS", "S"));
        System.out.println(shirts);

        //to sort Collection like List, Set
        //we can use Collection.sort(list)
        Collections.sort(shirts);
        System.out.println(shirts);

        List<Integer> nums = new ArrayList<>(Arrays.asList(234, 55, 77, 322, 55, 1, 22, -10));
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);

        int maxValue = Collections.max(nums);
        System.out.println(maxValue); //322

        //max method doesn't expect the collection to be sorted
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(234, 55, 77, 322, 55, 1, 22, -10));
        System.out.println(nums);
        int maxValue2 = Collections.max(nums2);
        System.out.println(maxValue2); //322

        //Getting min from collection
        int minValue = Collections.min(nums2);
        System.out.println(minValue); //-10

        Collections.reverse(nums2);
        System.out.println(nums2);

        Collections.sort(nums2);
        int indexOfOne = Collections.binarySearch(nums2, 22);
        System.out.println(indexOfOne);

        Collections.swap(nums, 0, nums.size() - 1);
        System.out.println(nums2);

        List<Integer> num2UnMod = Collections.unmodifiableList(nums2);
        System.out.println(num2UnMod);
        //num2UnMod.add(2); Immutable list
        System.out.println(num2UnMod);

    }

    /*
    This is print method
     */
    public void print() {
    }

    /*
    Sums up the value of i with value of x

    @param i = first value
    @param x - second value
     */
    public void sum(int i, int x) {

    }
    //when creating methods myself or peer reviewing codes I always make sure methods have clear
    //and specific Java Docs
}
