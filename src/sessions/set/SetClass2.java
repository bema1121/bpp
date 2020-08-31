package sessions.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetClass2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //add method ads an element to the hash set
        set.add("John Doe");

        //Arrays.asList will generate a list of values provided
        List<String> list = Arrays.asList("Antony Blevins","Nash Krueger","Rylan Foster","Rolando Monroe");
        //addAll ads all the elements from a provided collection to the set

        //You can pass a collection to the constructor
        //HashSet stores elements without particular order
        Set<String> set2 = new HashSet<>(Arrays.asList("Marry Dean","Nick Karter"));
        System.out.println(set2);
        set.addAll(list);
        set.addAll(set2);

        //remove methods removes an element from a set, by value
        set.remove("John Doe"); //they have to match exactly
        System.out.println(set);

        //size method returns 6
        System.out.println(set.size());

        //Remove all elements from a collection
        set.clear();
        System.out.println(set);

       //isEmpty returns boolean true if set is empty and false otherwise
        System.out.println(set.isEmpty());

        //contains expects an elements as a parameter and returns true if our set
        //contains that element
        set.addAll(set2);
        System.out.println(set.contains("Marry Dean"));

    }
}
