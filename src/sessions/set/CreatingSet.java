package sessions.set;

import java.util.*;

public class CreatingSet {
    public static void main(String[] args) {
//        Set<Integer> numbers = new HashSet<>();
//        Set<String> names = new LinkedHashSet<>();
//        Set<String> bigNames = new HashSet<>(1000);

        List<Integer> listNumbers = Arrays.asList(3,9,1,4,2,5,3,8,9,1,3,8,6);
        System.out.println(listNumbers);
        Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
        System.out.println(uniqueNumbers);

    }
}
