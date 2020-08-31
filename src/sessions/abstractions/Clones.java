package sessions.abstractions;

//abstract classes may or may not implement abstract methods that
//are inherited

public abstract class Clones extends Fruit {

    //here I am designing in a consideration of
    //one or more Clones will have 50 for sugar per ounce
    @Override
    public double calculateSugarPerOunce(){
        return 50;
    }
//    public double calculateFat(){
//        return 20;
//    }
}
