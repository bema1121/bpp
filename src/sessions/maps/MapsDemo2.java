package sessions.maps;

import java.util.*;

public class MapsDemo2 {

    public static void main(String[] args) {
        //students first and lastName mapped with id.
        //keys(ids) must be unique.
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "John Doe");
        students.put(2, "Elon Musk");
        System.out.println(students.get(2));
        //getOrDefault -> return the value for the key if the key exists
        //otherwise you can choose what it should return.
        System.out.println(students.getOrDefault(3, "Such Id doenst exits"));
        System.out.println(students.getOrDefault(1,"Such Id Doesnt exist"));
        //Streams and Lambdas are new features of Java.
        //They simplify iterating and computing some actions on the collection items.
        //keySet method return a Set of the keys. Set is used here because
        //keys in the map are guaranteed to be unique.
        students.put(3, "Aiday L");
        students.put(4, "Ainura");
        students.put(5, "Akif");
        //students.keySet() return an AbstractSet which is an immutable type of the set.
        // Set<Integer> studentIds = new HashSet<>(students.keySet()); use this if need to modify the Set
        Set<Integer> studentIds = students.keySet();//purpose is to get all of the existing ids
        Iterator<Integer> idsIterator = studentIds.iterator();
        while (idsIterator.hasNext()) {
            int id = idsIterator.next();
            String studentName = students.get(id);
            System.out.println("student id: " + id + " Studnet Name: "+ studentName);
        }
        //values return a Collection of the values in the map
        //Collection can store duplicate values
        //Collection doesnt have a get method to get the value by indexes.
        Collection<String> studentNames = students.values();
        //how do we access each value in the collection that doesnt have indexes?
        //for(dataType of each Value : collectionVar)
        for (String value : studentNames) {
            System.out.println(value);
        }
        Set<Map.Entry<Integer, String>> entries = students.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer studentId = entry.getKey();
            String studentName = entry.getValue();
            System.out.println(studentId + " => " + studentName);
        }
        //putAll method adds all of the values from the map in the param
        //to the current map
        //if maps contain duplicate keys
        //the key value pair from the map in the param will be used
        //the original one will be overridden. (override -> updating)
        Map<Integer, String> studentsFromGoogle = new HashMap<>();
        studentsFromGoogle.put(100, "Sundar Pichai");
        studentsFromGoogle.put(101, "Catherine Courage");
        studentsFromGoogle.put(102, "Eve Andersson");
        studentsFromGoogle.put(1, "Ruth Pora");
        students.putAll(studentsFromGoogle);
        System.out.println(students);
    }

}
