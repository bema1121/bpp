package sessions.set.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class iteratorClass1 {
    public static void main(String[] args) {
        //hasNext(); return Boolean
        //next(); return element
        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
        names.add("Peter");
        names.add("Alice");
        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(names);
        }
    }
}
