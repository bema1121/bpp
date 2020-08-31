package myExamples.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtils {
    public static  void main(String[] args) {



                /**
                 * Write a function that returns a boolean if find keywords and then remove them
                 */
                ListUtils listUtil = new ListUtils();
                List<String> wordList = new ArrayList(Arrays.asList("hi","hey","hi","yo"));
                boolean found = listUtil.removeAll(wordList,"hi");
                System.out.println("Found: " + found);
                System.out.println("Updated List: " + wordList);
            }
            public boolean removeAll(List<String> wordList, String targetWord){


                return false;
            }
        }




