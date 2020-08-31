package homeWorks.List;

import java.util.Arrays;
import java.util.List;

public class doubleTheList {
    public static void main(String[] args) {
        System.out.println(doubleTheList(Arrays.asList(3,5,7)));

    }public static List<Integer> doubleTheList(List<Integer> nums){
      //List<Integer> double1 = new ArrayList<>();
       for(int i = 0; i < nums.size(); i++){
           nums.set(i,nums.get(i) * 2);
       }
       return nums;
    }

}
