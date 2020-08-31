package homeWorks.Sets;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Treeset {

        public static void main(String[] args) {

            List<String> brands = new ArrayList<>();

            brands.add("Pepsi");
            brands.add("Amazon");
            brands.add("Volvo");
            brands.add("IBM");
            brands.add("HP");
            brands.add("Apple");
            brands.add("Starbucks");

            TreeSet<String> brands2 = new TreeSet<>();
            brands2.addAll(brands);
            System.out.println(brands2);

            // print ascending order all items);
            // print last element

            //print head set IBM
            // print tail set IBM
            //System.out.println(brands2.subSet()????????);
        }
}
//[Amazon, Apple, HP, IBM, Pepsi, Starbucks, Volvo]
//        [Volvo, Starbucks, Pepsi, IBM, HP, Apple, Amazon]
//        Amazon
//        Volvo
//        [Amazon, Apple, HP, IBM]
//        [Pepsi, Starbucks, Volvo]
//        [Apple, HP, IBM, Pepsi, Starbucks]
