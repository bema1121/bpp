package homeWorks.Loops;

public class LargerString {
    public static void main(String[] args) {
//        Given a string and a non -negative int n, return
//        a larger string that is n copies of the original string.
//
        System.out.println(stringTimes("Hi", 2)); //→"HiHi"
        System.out.println(stringTimes("Hi", 3)); //→"HiHiHi"
        System.out.println(stringTimes("Hi", 1)); //→"Hi"

    }
    public static String stringTimes(String str, int n){
        String str2 = "";
        for(int i = 0; i < n; i++){
            str2= str2+str;

        }
        return str2;
    }


    }

