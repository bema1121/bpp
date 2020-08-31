package myExamples.objects.custom_classes;

public class MyCars {
    public static void main(String[] args) {

        Car car1 = new Car();
        //car1.printCarInfo();
        car1.make = "Ford";
        car1.model = "Fiesta";
        car1.color = "Grey";
        car1.currentSpeed = 55;

        car1.printCarInfo();
        car1.showCurrentSpeed(70);
        car1.showCurrentSpeed(35);
        car1.drive();
        System.out.println("before : "+car1.currentSpeed);
        car1.accelerate(10);
        System.out.println("after : "+car1.currentSpeed);

        BmW bmw = new BmW();
        System.out.println(bmw.make);
        bmw.model = "m3";
        bmw.showPrice();
        System.out.println("Car Price: "+bmw.price);

        BmW bmw2 = new BmW();
        bmw2.model = "X3";
        bmw2.showPrice();
        //System.out.println();


    }

}
