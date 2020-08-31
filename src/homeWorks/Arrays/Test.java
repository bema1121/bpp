package homeWorks.Arrays;

public class Test {


    public static void main(String args[]) {
        int arr[] = {3, 1, 2, 5, 4};

        System.out.println("sum of array values : " + sum(arr));
    }

    public static int sum(int[] arr) {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];


        }
        return sum;
    }
}



