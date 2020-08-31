package myExamples.custom_classes_encapsulation;
import java.util.*;
public class Starbucks {

    public static void main(String[] args) {

        //declare an array that can store 2 Coffee objects
        //int[] nums = new int[2];
        //String[] str = new String[3];
        //str[0] = "java";
        //declare coffeeArray that can store 2 coffee objects
        Coffee[] coffeeArray = new Coffee[2];
        //create coffee object and assign to index 0
        coffeeArray[0] = new Coffee();
        //access coffee object in index 0 and set data
        coffeeArray[0].setCoffeeInfo("EXPRESSO","TALL",2.55,7);
        //access coffee object in index 0 and call method getCoffeeInfo
        coffeeArray[0].getCoffeeInfo();

        //create a single object first
        Coffee latte = new Coffee();
        latte.setCoffeeInfo("Cafe Latte","Grande",3.85,190);
        //assign the latte object to index 1 of the array
        coffeeArray[1] = latte;
        //print data from object in index 1
        coffeeArray[1].getCoffeeInfo();
    }

}
