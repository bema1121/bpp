package homeWorks.JavaMethods;
import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodExample2 {

//        [Thomas, Robin, Jane, David, Becky]
//                false
//                true
//                false
//                2
//                [Robin, Jane, David]
//                true
//                []

        public static void main(String[] args) {

            List<String> names = new ArrayList<>();

            names.add("Jane");
            names.add(0, "Thomas");
            names.add(1, "Robin");
            names.add("David");
            names.add("Becky");
            System.out.println(names);
            System.out.println( names.isEmpty());
            System.out.println(names.contains("Becky"));
            System.out.println(names.contains("Anna"));
            System.out.println(names.indexOf("Jane"));
            System.out.println(names.subList(1,4));
            System.out.println(names.removeAll(names));
            System.out.println(names);


        }
    }

