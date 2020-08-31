package myExamples.custom_classes_encapsulation;

import java.util.Arrays;

public class Burger7 {

    public static void main(String[] args) {
        Burger burger1 = new Burger();
        burger1.name = "COWBOY";
        String[] ings = {"onion crisps","american cheese","pickles","lettuce","b7 sauce"};
        burger1.ingredients = ings;

        System.out.println(burger1.name);
        System.out.println(Arrays.toString(burger1.ingredients));
        //print first ingredient
        System.out.println(burger1.ingredients[0]);
        //print all ingredients using a loop

        for(int i = 0; i < burger1.ingredients.length; i++){
            System.out.println(burger1.ingredients[i]);
        }

    }
}
