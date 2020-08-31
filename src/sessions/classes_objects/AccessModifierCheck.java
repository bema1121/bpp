package sessions.classes_objects;

public class AccessModifierCheck {

    public static void main(String[] args) {
        Car car1 = new Car(2020, 0,"Buggati", "Veron", "Red", 2000000);
        // car1.printX(); => local variable are not accessible from different classes
        int year = car1.year; //instance variables are accessible from different classes
        //but it depends on the access modifier of the instance variable.
        //long mileage = car1.mileage;//compile time error bc mileage is private in Car class
        String color = car1.color;
        String model = car1.model;
        System.out.println(year);
        System.out.println(color);
        System.out.println(model);
        System.out.println(car1.make);
        Car car2 = new Car(2011, 250000, "Toyota", "Camry", "Grey", 2000);
        int year2 = car2.year;
        String color2 = car2.color;
        String model2 = car2.model;
        System.out.println(year2);
        System.out.println(color2);
        System.out.println(model2);
        System.out.println(car2.make);
        //HomeWork Create 5 cars put them a List.
        //and print out the cars' make, model and year only if the mileage is not more than 100000
        //you only need one System.out.println statement.
    }
}
