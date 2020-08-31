package sessions.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shirts {
    public static void main(String[] args) {
        //Loaded truck
        List<String> clothes = new ArrayList<>(Arrays.asList("S","L","M","M","L","M","S","L","M","M","S","L","XL"));

        //brought empty carts
        List<String> clothesMedium = new ArrayList<>();
        List<String> clothesLarge = new ArrayList<>();
        List<String> clothesSmall = new ArrayList<>();

        //checking what I have in the truck
        System.out.println(clothes);

        //going through each pallet
        for(String cloth: clothes){
            //checking if the pallet consists of M sized shirts
            if(cloth.equals("M")){
                clothesMedium.add(cloth);
            }
            //checking if the pallet consists of L sized shirts
            else if(cloth.equals("L")){
                clothesLarge.add(cloth);
            }
            //checking if the pallet consists of S sized shirts
            else if(cloth.equals("S")){
                clothesSmall.add(cloth);
            } //else if will save time by getting the first true and skipping the rest
        }

        clothes.removeAll(clothesMedium);
        clothes.removeAll(clothesLarge);
        clothes.removeAll(clothesSmall);

        //checking the content of carts and truck after unload
        System.out.println(clothesMedium);
        System.out.println(clothesLarge);
        System.out.println(clothesSmall);

        System.out.println(clothes);


    }
}
