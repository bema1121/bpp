package myExamples.randomRp.Array;

public class Arrays2 {
    public static void main(String[] args) {
        String [] names = new String[5];
        String [] names2 = {"Shaun","Roman", "Vlad","Burak","MARIA"};
        System.out.println(names2[4]);
        System.out.println("Number of items: "+names2.length);

        //array has fixed size
        String[] countries ={""};
        countries[0] = "USA";
        //String name = null;
        String []fruits = new String[]{"apple","orange"};
        //for each loop stands for collection of data
        //we need specify data type, variable name : our collection of data
        //for each loop
        //or enhanced loop
        for(String fruit: fruits){
            System.out.println(fruit);
        }



    }
}
