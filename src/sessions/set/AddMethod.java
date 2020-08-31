package sessions.set;

import java.util.HashSet;
import java.util.Set;

public class AddMethod {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
        System.out.println(names);
        if(names.add("Peter")){
            System.out.println("Peter is added to the set");
        }
        if(!names.add("Tom")){
            System.out.println("Tom is already added to the set");
        }
    }
}
