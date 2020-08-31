package homeWorks.Arrays;

public class Reverse {
    public static void main(String[] args) {

//        reverse() (Array & Method)
//                Write a method called reverse(), which takes an array
//    of int and reverse its contents. For example, the reverse of [1,2,3,4] is [4,3,2,1].
//        The method's signature is as follows:
//
//        public static void reverse(int[] array)

        int[] num = {1, 2, 3, 4};
        reverse(num);
    }

    public static void reverse(int[] array) {

        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+",");


        }
    }
}
