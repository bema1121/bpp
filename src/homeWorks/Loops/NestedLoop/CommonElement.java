package homeWorks.Loops.NestedLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElement {
    public static void main(String[] args) {

        List<Integer> common = new ArrayList<>();
        int[] arr1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] arr2 = {1, 0, 6, 15, 6, 4, 7, 0};

        System.out.println("Array1 : "+Arrays.toString(arr1));
        System.out.println("Array2 : "+Arrays.toString(arr2));

        int n = 0;
        int n2 = 0;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[i]){
                    if(!common.contains(arr1[i])){
                        common.add(arr1[i]);
                    }
                }
            }
        }
        System.out.println("Common element : "+common);




    }
}
