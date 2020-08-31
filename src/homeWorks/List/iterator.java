package homeWorks.List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class iterator {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
        names.add("Peter");
        names.add("Alice");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
        System.out.println();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
        names.forEach(System.out::println);
    }
}
