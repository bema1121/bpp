package sessions.set;

import java.util.HashSet;
import java.util.Set;

public class RemoveMethod {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
        if(names.remove("Mary")){
            System.out.println("Mary is removed");
        }
    }
}
