package sessions.abstractions;

public class FruitShop {

    public static void main(String[] args) {
        Strawberry strawberry = new Strawberry();
        System.out.println(strawberry.calculateSugarPerOunce());

        Apple apple = new Apple();
        System.out.println(apple.calculateSugarPerOunce());

        //  Fruit fruit1 = new Fruit();

        Fruit fruit = new Apple();
        System.out.println(fruit.calculateSugarPerOunce());
        System.out.println(getSugar(fruit));

        Apple apple1 = new Apple();
        System.out.println(getSugar(apple1));
    }
    public static double getSugar(Fruit fruit){
        return fruit.calculateSugarPerOunce();
    }
}




