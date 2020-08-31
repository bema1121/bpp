package myExamples.randomRp.ArrayList;

import java.util.ArrayList;

public class ListPractise {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        //List<String> ls = new ArrayList<>();

        //adding elements
        lst.add("Apple"); lst.add("Orange"); lst.add("Banana");
        System.out.println(lst);

        //getting elements
        System.out.println("first element "+ lst.get(0));
        System.out.println("second element "+lst.get(1));

        //check if items exists in the list contains()
        System.out.println(lst.contains("Apple"));

        //getting the index of item by value indexOf(item)
        System.out.println("index of Apple "+lst.indexOf("Apple"));

        //checking how many items int the list size()
        System.out.println("item count "+lst.size());

        //checking if the list is empty
        System.out.println("list is empty ? "+lst.isEmpty());

        //setting the value for certain index
        lst.set(1,"Pear");
        System.out.println("new list items "+lst);

        //removing item by index
        lst.remove(0);
        System.out.println("new list after deleting "+lst);

        //removing item by value
        lst.remove("Banana");
        System.out.println("new list items after deleting "+lst);

        //removing all the items int the list
        lst.clear();
        System.out.println("new list items after clearing "+lst);

        //checking if the list is empty or not
        System.out.println("list is empty "+lst.isEmpty());








    }
}
