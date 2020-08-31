package myExamples.custom_classes_encapsulation;

import java.util.ArrayList;

public class DSWShoeStore {

    public static void main(String[] args) {
        Shoes shoes1 = new Shoes();
        shoes1.setShoesData("ALDO",6.5);
        System.out.println(shoes1.getShoesData());

        Shoes shoes2 = new Shoes();
        shoes2.setShoesData("Allen Edmonds",7.5);

        Shoes shoes3 = new Shoes();
        shoes3.setShoesData("BOSS HUGO BOSS",9.0);

        Shoes[] shoesArray = new Shoes[3];
        shoesArray[0] = shoes1;
        shoesArray[1] = shoes2;
        shoesArray[2] = shoes3;

        System.out.println(shoesArray[0].getShoesData());
        System.out.println(shoesArray[1].getShoesData());
        System.out.println(shoesArray[2].getShoesData());

        System.out.println();

        //ArrayList of Shoes
        ArrayList<Shoes> myShoes = new ArrayList<>();
        myShoes.add(shoes1);
        myShoes.add(shoes2);
        myShoes.add(shoes3);

        System.out.println(myShoes.get(0).getShoesData());
        System.out.println(myShoes.get(1).getShoesData());
        System.out.println(myShoes.get(2).getShoesData());

        System.out.println(myShoes.get(0).size);
        System.out.println(myShoes.get(1).size);
        System.out.println(myShoes.get(2).size);

        Shoes redShoes = myShoes.get(1);
        System.out.println(redShoes.getShoesData());

        //let's use for each loop and print data for each shoe
        for(Shoes shoes: myShoes){
            System.out.println(shoes.getShoesData());
        }

        //print name of Shoe in the list that size is more than 7

        for(Shoes shoes: myShoes){
            if(myShoes.size() > 7.0){
                System.out.println(shoes.brand);
            }
        }






    }
}
