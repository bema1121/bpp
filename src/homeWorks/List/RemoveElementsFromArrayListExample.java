package homeWorks.List;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {

        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: " + programmingLanguages);

        programmingLanguages.remove(5);
        System.out.println("After remove(5): " + programmingLanguages);
        programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);
        programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);


        // Remove the element at index `5`
        //  remove "Kotlin"
        // Remove all the elements that exist in a given collection

        // Remove all elements from the ArrayList
    }
}


