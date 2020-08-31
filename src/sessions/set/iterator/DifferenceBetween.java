package sessions.set.iterator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DifferenceBetween {
    public static void main(String[] args) {
        //List
        //List.of("","","");
        Set<String> set = new HashSet<>(Arrays.asList("Antony Blevins", "Nash Krueger", "Rylan Foster", "Rolando Moore", "Jan Gardner"));
        Set<String> setOnlyFirstNames = new HashSet<>(); //new, empty set to store only first names
        Set<String> setOfLastNames = new HashSet<>();

        Iterator<String> iterator = set.iterator();
        //Antony Blevins => ["Antony","Blevins"]


        while(iterator.hasNext()){ //check if there is an element in front
            String curr = iterator.next(); //curr will be populated with new value with each iteration
            //curr.substring(0, indexOf(" "))
            String [] arr = curr.split(" "); //split the string into separate elements by the elements
            //["Antony","Blevins"]
            String firstName = arr[0]; //Take first element from an array
            //firstName = "Antony"/Nash
            setOnlyFirstNames.add(firstName); //add it to the set of only first names

        }
        iterator = set.iterator(); //storing new objet to the same variable/reference
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(set);
        System.out.println(setOnlyFirstNames);
        System.out.println(setOfLastNames);






        while (iterator.hasNext()) {
            String curr = iterator.next();
            System.out.println(curr);
        }

    }

    public static void met2() {
        Set<Integer> set = new HashSet<>();

        Iterator<Integer> iterator = set.iterator();
        Set<Integer> setOdd = new HashSet<>();

        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i % 2 != 0) setOdd.add(i);
            if (i < 0) iterator.remove();
        }
    }
}
