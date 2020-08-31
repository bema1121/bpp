package sessions.lists;


import java.util.ArrayList;
import java.util.Arrays;
//we can delete two imports above
//and bring everything from util package
//java.util.*;

public class ArrayListClass1 {
    public static void main(String[] args) {
        //List -- ArrayList
        //      -- LinkedList
        //List -- is the c

        //with array we can only store elements with the same data type
        //with lists we can store elements with different
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 2;

        System.out.println(Arrays.toString(arr)); //[10,2,0,0,0]

        ArrayList namesList = new ArrayList();
        System.out.println(namesList);
        //compared to arrays we can just pass reference to Arraylist in the
        //give an output similar to Arrays.toString(arr);
        namesList.add("Elena");
        System.out.println(namesList);
        namesList.add(true);

        //Unlike Arrays we don't have a way to initialize elements like -> {"Yellow","Black",
        ArrayList colorsList = new ArrayList<String>(10);
        //creates a size with default values for all elements
        //but the size is not fixed arrayList will still be able to resize and grow
        colorsList.add("Yellow");
        colorsList.add("Black");
        //colorsList.add(123) doesn't compile bc colorList has <String>
        //which means this list can only store Strings
        System.out.println(colorsList); //toString method


        ArrayList<String> colorListDup = new ArrayList<String>(colorsList);//String[] strArr = new String[5];
        //copies the values from the list that was passed to the params
        System.out.println(colorListDup);

        //ArrayList<int> --> doesn't compile List don't support primitive data type
        //Java provide wrapper classes for all of the primitives
        //Object representations of the primitive data types.
        //Integer i = 0;
        Integer num = new Integer(0);
        //literals -> this will convert primitive data type literals to Wrapper classes
        Integer i =0; //(new Integer(0))
        //Integer i = 0; is preferred way there is no cost to performance at all
        int num2 = i;
        //whole process of being able to assign values from primitive
        //to wrapper class and vice versa
        //autoboxing

        //Wrapper classes have methods
        //Wrapper classes are immutable

        // Wrapper classes is work around for not being able to store
        // primitive adat types in Collections(List,Set,Map)
        //Also, Wrapper classes have some methods

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(new Integer(100));
        nums.add(200);
        System.out.println(nums);

        ArrayList<Character> grades = new ArrayList<>();
        grades.add('c');
        grades.add('d');
        System.out.println(grades);




    }
}
