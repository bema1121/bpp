package homeWorks.Arrays;

import java.util.ArrayList;

public class TestArraylist {

    public static void main(String[] args) {
        //Creating a generic ArrayList
        ArrayList<String> arlTest = new ArrayList<String>();
        //Size of arrayList
        System.out.println("Size of ArrayList at creation: " + arlTest.size());
        //Lets add some elements to it
        arlTest.add("D");
        arlTest.add("U");
        arlTest.add("K");
        arlTest.add("E");

        //Recheck the size after adding elements
         System.out.println("Size of ArrayList after adding elements: " + arlTest.size());

        //Display all contents of ArrayList
        System.out.println("List of all elements: " + arlTest);

        //Remove some elements from the list
        arlTest.remove("U");
        System.out.println("See contents after removing one element: " + arlTest);

        //Remove element by index
        arlTest.remove(1);
        System.out.println("See contents after removing element by index: " + arlTest);

        //Check size after removing elements
        System.out.println("Size of arrayList after removing elements: " + arlTest.size());
        System.out.println("List of all elements after removing elements: " + arlTest);

        //Check if the list contains "K"
        System.out.println(arlTest.contains("K"));

    }
}


