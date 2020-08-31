package sessions.set;

import java.util.*;

public class Sets_1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("James");
        set.add("Joe");
        set.add("Lola");
        set.add("Jane");
        set.add("Joe");
        set.add("Linda");
        //set.add("James");
        //  set.add("Joe");
        //  set.add("Linda");
        //Provide the same type for your iterator that is the type of the collection you iterate through

        Iterator <String> iterator = set.iterator(); //Iterator declaration
        //hasNext () returns true if iterator has a next element
        //.get(0) + .get(1)
        //1,2,3,4

        for(String s: set){
            System.out.println(s.toLowerCase());
        }
        // You can not remove elements directly from a collection while iterating through the collection using iterator
        // You can Only remove using iterator .remove() method
        System.out.println(set);


        while(iterator.hasNext()){ //hasNext()  returns true if there is an element following after
            //the current element
            String curr = iterator.next();
            System.out.println(curr);// Method of a set
            if(curr.equals("James")) iterator.remove(); // Method of an iterator that will remove an element of a current iteration
            //if(curr.equals("James")) iterator.remove();
        }
        iterator = set.iterator();
        System.out.println(set);
    }



    public static void contains(String[] args) {
        int i = 7;
        Integer j = i;

        Set<String> set = new HashSet<>();
        set.add("James");
        set.add("Joe");
        set.add("Linda");
        System.out.println(set);
        System.out.println(set.contains("Molly")); //returns true if current set contains the given element

    }

    public static void calc(Scanner c) {
        Set<String> listOfoperations = new HashSet<>(Arrays.asList("+", "-"));
        //List of operations that our calc can provide
        System.out.println("Enter a number: ");
        int i = c.nextInt();

        System.out.println("Enter another number : ");
        int c2 = c.nextInt();
        c.nextLine();

        String operator = "";

        do { //Continuasly ask user to enter an operator if the entered operator
            System.out.println("Enter the operator (+, -)");
            operator = c.nextLine();
        } while (!listOfoperations.contains(operator));

        if (operator.equals("+")) {
            System.out.println(i + 12);
        } else {
            System.out.println(i - 12);
        }
    }
    public static void contains() {
        int i = 7;
        Integer j = i;

        Set<String> set = new HashSet<>();
        set.add("James");
        set.add("Joe");
        set.add("Linda");
        System.out.println(set);
        System.out.println(set.contains("Molly")); //returns true if current set contains the given element

    }

}
