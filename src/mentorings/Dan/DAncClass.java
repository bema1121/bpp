package mentorings.Dan;
import java.util.*;
public class DAncClass {

    public static void main(String[] args) {
            //  for example, if its 1, 2, 2, 3, 4, 5, 6, 7, 8, 9
            List<Integer> oldList = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,5,6,7,8,9));
            Set<Integer> newList = new HashSet<>(oldList);
            System.out.println(newList);
        }
    }


