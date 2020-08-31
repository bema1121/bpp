package myExamples.custom_classes_encapsulation;

public class MyCoffees {
    public static void main(String[] args) {

        Coffee coffee1 = new Coffee();
        coffee1.name = "ICED CARAMEL MACCHIATO";
        coffee1.size = "GRANDE";
        coffee1.price = 4.75;
        coffee1.calories = 250;

        coffee1.getCoffeeInfo();

        Coffee coffee2 = new Coffee();
        coffee2.setName("JAVA CHIP");
        coffee2.size = "VENTI";
        coffee2.price = 5.95;
        coffee2.calories = 600;

        coffee2.getCoffeeInfo();
    }
}
