package tests.homework;

import java.util.HashMap;
import java.util.Map;

public class getDup {
    public static void main(String[] args) {
        String[] getDup = {"1","g","aabb","2","7","7","2","aa","7"};

        System.out.println(getDup(getDup));

    }

    public static int getDup(String[] r){

        Map<String,Integer> repeatationMap= new HashMap<String,Integer>();
        for(String str : r){

            if(repeatationMap.containsKey(str)) {
                repeatationMap.put(str,repeatationMap.get(str) + 1);
            }
            else {
                repeatationMap.put(str, 1);
            }
        }

        int count = 0;
        for(int repatCount : repeatationMap.values()){
            if(repatCount > 1) {
                count++;
            }
        }
        System.out.println("Number of Strings repeated : " + count);

//        Set<String>  uniqueElements = new HashSet<>(asList(r));
//
//        int count = 0;
//
//        for(String uniqueElement : uniqueElements) {
//
//            for(String element : r) {
//                if(uniqueElement.equals(element)){
//                    count++;
//                }
//            }
//        }


//        for (int i = 0; i < uniqueElements.size(); i++) {
//
//            for (int j = i + 1; j < r.length; j++) {
//                if (r[i].equals(r[j])) {
//                    count++;
//
//                }
//            }
//
//        }
        return count;

    }

}
