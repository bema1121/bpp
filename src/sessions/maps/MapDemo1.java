package sessions.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo1 {

    //Purpose of the map is to store values that can later be accessed by keys.
    //You need one info(key) in order to get the info you need(value)
    //All collections in programming are used as cache. => cache is a memory that exists while the program is running.
    //when it stops the all info is lost and not restoreable.
    //cache is super fast to access this is the biggest advantage and only reason cache is used.
    public static void main(String[] args) {
        //Map<> = new HashMap<>();
        //Map<> = new TreeMap<>();
        //Map<> = new LinkedHashMap<>();
        //List<Double> = new ArrayList<>();
        //List<Integer> = new LinkedList<>();
        //Set<String> = new HashSet<>();
        //Set<Character> = new LinkedHashSet<>();
        //Set<Float> = new TreeSet<>();
        //1. give the data type of the key
        //2. give the data type of the value
        //Write an app which will give me all zips for the city.
        //Ex: Zipcodes and cities
        //key -> city.
        //value -> zip codes -> List<Integer> codes.
        //Map<String, List>
        //Write an app which will tell me which city the zip belongs to
        //I will give you a zip give me the city it belongs to
        //Ex: any app that requires you to fill out payment info
        //and when you fill out zip code
        //the app auto-fills the city.
        //zip is the key. why? bc the input is the zip. (60001,    79707,   19115,        15221,      23450,   55102)
        //and the value I need to return is the city.   (Chicago, Midland, Philadelphia,  Pittsburgh, Virginia. St Paul)
        Map<Integer, String> zipAndCityMap = new HashMap<>();//unordered, nulls are allowed
        //put is a method that adds a new key value pair to the map(collection)
        zipAndCityMap.put(60001, "Chicago");//separate the key and value by a comma.
        zipAndCityMap.put(79707, "Midland");
        zipAndCityMap.put(null, "No such zip");
        zipAndCityMap.put(19115, "Philadelphia");
        zipAndCityMap.put(15221, "Pittsburgh");
        zipAndCityMap.put(23450, "Virginia");
        zipAndCityMap.put(55102, "St.Paul");
        System.out.println(zipAndCityMap);//7 -> Key Value Pairs(Map)
        //put can also be used to update the value of the key.
        zipAndCityMap.put(60001, "Des Plaines");
        zipAndCityMap.put(60625, "Chicago");
        System.out.println(zipAndCityMap);
        //Get method will return the value based on the key. if key doesnt exist in the map get() return null
        //Comparison analysis -> diff between get method in map and list
        //better -> list is simpler to set up and understand.
        //when searching for a specific value list might require you to loop through the it. bc we dont normally know the indexes for element
        //Map is super convenient in getting a specific value bc the key is also known.
        //List is used way more than map. BC we have info that just needs to be saved in one packet(collection).
        String stPaul = zipAndCityMap.get(55102);
        System.out.println(stPaul);
        System.out.println(zipAndCityMap.get(23450));
        //remove the key value mapping
        zipAndCityMap.remove(79707);
        System.out.println(zipAndCityMap);
        System.out.println();
        //Write an app or feature that will give me a meaning for the word
        //given the word please give me the meaning(Sentence).
        Map<String, String> wordMeanings = new HashMap<>();
        wordMeanings.put("paradox", "Something strange");
        wordMeanings.put("Java", "Open Source object oriented Programming Language that is platform independent");
        wordMeanings.put("SoftSkills", "A class held on Saturday where we learn about company software dev methodologies");
        wordMeanings.put("Dev", "Stands for Developer. A programmer who write software apps");
        System.out.println(wordMeanings);
        System.out.println(wordMeanings.get("SoftSkills"));
        System.out.println(wordMeanings.get("paradox"));
        //misspelling will give us null.
        //case sensitive
        //100% match is required
        System.out.println(wordMeanings.get("paradoxx"));
        //remove paradox => removes the key value +
        System.out.println(wordMeanings.remove("paradox"));
        //why we might need to check if we removed the right value. If it was actually removed.
        if (wordMeanings.remove("paradoxx") == null) {
            System.out.println("Warn - the word that is trying to be deleted doesnt exist.");
        }
        System.out.println(wordMeanings);
        System.out.println();
        //Is List and object? -> everything besides primitive data types are objects. ex:Array, List, Map, String -> objects
        //Can you have multiple values for one key?
        //state key, cities -> tell which cities does the state have. -> Map<String, List<String>> - List<String>
        //word, meanings -> Map<String, List<String>>
        //continent, counties. ->
        //make, models. -> Map<String, List<String>>
        //lake, fish(plural) ->
        //Real Scenario:
        //Store all transactions(how much spend on each trade) of the firm per day so that Data Analysts are able to
        //make analysis.
        //FirmID.      Transactions
        //One pair would be the firmId and All transaction just for that firm
        //Map<Integer, List<Double>> ->
        // Map<Integer, String>
        //List<Double>
        //In the declaration(creating) part key and value are similar to method param declaration
        //public int mimicMap(Integer key, Double value)
        //public int mimicMap(Integer key, List<Double> values)
        //Firms => 1, List<Double>($100,$222,$99)
        //      => 2, List<Double> ($50, $20)
        //      => 3, List<Double>($20).
        Map<Integer, List<Double>> firmTransactionsMap = new HashMap<>();
        //List<Double> list = Arrays.asList(20.22,19.99); list will be immutable
        //List<Double> list2 = new ArrayList<>(list);
        List<Double> firm1Transactions = new ArrayList<>();
        List<Double> firm2Transactions = new ArrayList<>();
        List<Double> firm3Transactions = new ArrayList<>();
        firm1Transactions.add(100.00);
        firm1Transactions.add(222.00);
        firm1Transactions.add(99.00);
        firm2Transactions.add(50.00);
        firm2Transactions.add(20.00);
        firm3Transactions.add(20.00);
        firmTransactionsMap.put(1, firm1Transactions);
        firmTransactionsMap.put(2, firm2Transactions);
        firmTransactionsMap.put(3, firm3Transactions);
        System.out.println(firmTransactionsMap);
        //Maps can have other collections as values or keys. Collections are generally not used as keys.
        //Genre -> Songs
        System.out.println(firmTransactionsMap.get(2));
        System.out.println(firmTransactionsMap.get(1));
        //firmTransactionsMap.get(1) => List<Double>
//        List<Double> trascationsForFirm1 = firmTransactionsMap.get(1);
//        System.out.println(trascationsForFirm1.get(1)); => can be simplified to method chaining
        //we dont really need store the list return from map(save memory)
        //rather continue by using the method
        System.out.println(firmTransactionsMap.get(1).get(1));
        System.out.println(firmTransactionsMap.get(2).get(0));
        //add one more transaction to firm3.
        //transaction value = 79.99
        //firm3Transactions.add(79.00);// => use maps to get the values.
        //firmTransactionsMap.get(3).add(79.99);
        //firmTransactionsMap.put(3,firm3Transactions).add(79.99); =>
        System.out.println(firmTransactionsMap);
        //Contains methods in collections are used to check if the value you are looking for exists.
        //Ex: Store and store stuff in the front door who is able to tell you if the  they have the item you are looking for
        //How does it help?
        //Contains key => return true if the key is present in the map otherwise false
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "John Doe");
        if (students.containsKey(1)) {
            students.get(1); //John Doe
        }
        //System.out.println(students.get(2).equalsIgnoreCase("John Doe")); =>
        //contains value =>  return true if the value is present in the map otherwise false
        Map<Integer, String> students2 = new HashMap<>();
        students2.put(1, "John Doe");
        if (students2.containsValue("John Doe")) {
            //find it's id.
        }
        //To update we can use put or replace(K, V)
        students2.replace(1, "Elon Musk");
        System.out.println(students2);
        students2.put(1, "Steve Jobs");//use this method
        System.out.println(students2);
        System.out.println(wordMeanings.size());
    }




}
