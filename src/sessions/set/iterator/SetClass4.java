package sessions.set.iterator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetClass4 {
    public static void main(String[] args) {




    }
    public static void  containsAll(Set<String> s1, Set<String> s2) {
        Set<String> set1 = new HashSet<>(Arrays.asList("Antony Blevins", "Nash Krueger", "Rylan Foster",
                "Rolando Moore", "Jan Gardner"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Antony Blevins", "Nash Krueger", "Rylan Foster",
                "Rolando Moore", "Jan Gardner", "Magda ", "    ", "     "));

        //containsAll(set) expects another set, checks if current set contains all the elements from a provided set
        System.out.println(set2.containsAll(set1));

        System.out.println(set1.contains(set2)); //false bc set2 is larger than set1

    }
}
