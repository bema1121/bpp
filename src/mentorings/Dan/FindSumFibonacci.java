package mentorings.Dan;

import java.util.Scanner;

public class FindSumFibonacci {
    /**
     * Check each element in an array if its fibonachi numbers if found, add to temp variable, and then the sum of it check if  its fibonachi?
     * fibonachi numbers are : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025
     * static final int MAX = 100005;
     * Input: arr[] = {2, 3, 9, 15, 22}
     * 2 + 3 = 5 then check if 5 is a fibonachi numbers true
     * Input: arr[] = {1, 2, 3, 5, 8};
     * 1+2+3+5+8 = 19 no
     * Third message “try small numbers ma man” if its more than MAX
     * Output: Yes
     * Explanation:
     * Yes, as there are two Fibonacci numbers in the array i.e. 2 and 3.
     * So, the sum of Fibonacci numbers is 2 + 3 = 5 and 5 is also a Fibonacci number.
     * Input: arr[] = {1, 2, 3}
     * Output: No, because sum of 1+2+3=6 which is not a Fibonachi number
     */

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Please enter the number: ");
        int fibNum[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025};

        int arr[] = {1, 2, 3, 5, 8};
        int sum = 0;
        //System.out.println(fibNUmOne(arr)+"this are fibonacci numbers we find in Array");

        //System.out.println(fibNumSum(fibNUmOne(arr))+"this is a sum of fibnum");

        System.out.println(fibNUmOne(arr));
        fibNumSum(fibNUmOne(arr));


    }

    public static int[] fibNUmOne(int[] num) {
        int fibNum[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025};
        int[] find = {};
        int number = 0;
        for (int i = 0; i < num.length; i++) {
//            for (int j = i + 1; i < num.length; j++) {
            if (num[i] == fibNum[i]) {
                find[i] += num[i];

//


            }
        }
          return find;
    }

    public static void fibNumSum(int[] find) {
        int fibNum[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025};

        for (int i = 0; i < find.length; i++) {
            if (find[i] == fibNum[i]) {
                int number = find[i] + find[i];

                System.out.println("This number " + find + "is a fibonacci number");
            }else{
                System.out.println("This number " + find + "is not  a fibonacci number");
            }

        }



    }

}
