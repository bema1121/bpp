package sessions.maps;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfCharacterOccurances {

    //Create a program which will calculate the number occurrences of each character in a String
    //ex: apple -> a: 1
    //          -> p: 2
    //          -> l: 1
    //          -> e: 1
    //Map<String, Integer> = new HashMap<>();
    //if map doesnt contain the char then add the char as a key
    //and 1 as the value since it's the first occurrence of the char.
    //if map contains the char in the keys then update it's value
    public static void main(String[] args) {
        String str = "ppiiiiiiiieeeeeapleineapple";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'p') {
                count++;
            }
        }
        System.out.println("p: " + count);
        ///////pineapple
        Map<Character, Integer> charOccurrencesMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!charOccurrencesMap.containsKey(str.charAt(i))) {
                charOccurrencesMap.put(str.charAt(i), 1);
            }
            else {
                // +1 to what? to which value? to existing value.
                //how do you get the existing value?
                //how do you get the value for the key?
                //charOccurrencesMap.values() -> all of the values
                //charOccurrencesMap.get(key) -> value for this key will be returned
                int numCurrentOccurrences = charOccurrencesMap.get(str.charAt(i));
                charOccurrencesMap.put(str.charAt(i), numCurrentOccurrences+1);
            }
        }
        System.out.println(charOccurrencesMap);
    }

}
