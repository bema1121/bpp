package sessions.arrays;



import java.util.Arrays;

//Arrays Class
public class ArraysUtilClass {
    public static void main(String[] args) {
        String[] bugs = {"Beetle", "LdyBug", "Cricket"};
        System.out.println(Arrays.toString(bugs));

        int[] studentsAges = null;
        System.out.println(Arrays.toString(studentsAges));

        studentsAges = new int[0];
        System.out.println(Arrays.toString(studentsAges));

        int[] studentsAges2 = {33, 31, 30, 25, 29, 28};
        System.out.println(Arrays.toString(studentsAges2));


    }
}
