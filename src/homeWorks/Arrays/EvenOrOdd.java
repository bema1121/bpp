package homeWorks.Arrays;

public class EvenOrOdd {
    public static void main(String[] args) {
//        Given array (elements): 10 11 12 13 14
//        Output:
//        Odd numbers in the array are : 10 12 14
//        Even numbers in the array are : 11 13

        int[] num = {10, 11, 12, 13, 14};
        int even = 3;
        int[] evenNumber = new int[even];

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                evenNumber[even] = num[i];
                System.out.println(evenNumber);

            }
        }
        int odd = 2;
        int[] oddNumber = new int[odd];
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 1) {
                oddNumber[odd] = num[i];
                System.out.println(oddNumber);

            }


            }
        }

    }
