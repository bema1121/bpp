package sessions.set.iterator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClass3 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Set<Integer> setEven = new HashSet<>(); //for each practise, only even numbers
        Set<Integer> setOdd = new HashSet<>();  //iterator practise, odd numbers

        //Read only purpose
        for(Integer i: set){
            if(i % 2 == 0) setEven.add(i); //addi
           // if(i == 8) set.remove(i); you can do it inside each loop it's only for read purpose
            }


        //Iterator read and write and remove options
        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext()){
            int i = iterator.next();
            if(i % 2 != 0) setOdd.add(i);

            if(i == 8) iterator.remove();
        }
        System.out.println(set);
        System.out.println(setEven);
        System.out.println(setOdd);

    }
        public static void met1(){

            Set<String> set = new HashSet<>(Arrays.asList("Antony Blevins","Nash Krueger","Rylan Foster","Rolando Moore"));
        //.iterator() returns an instance of an iterator for the collection
        Iterator<String> iterator2 = set.iterator();

        while(iterator2.hasNext()){
            System.out.println(iterator2.next().toUpperCase());
        }
    }
}
