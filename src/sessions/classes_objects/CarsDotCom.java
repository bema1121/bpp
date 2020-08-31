package sessions.classes_objects;

import java.util.ArrayList;
import java.util.List;

public class CarsDotCom {

    public static void main(String[] args) {
        //HomeWork Create 5 cars put them a List.
        //and print out the cars' make, model and year only if the mileage is not more than 100000
        //you only need one System.out.println statement.
        //Car class doesnt have to be modified at all.
        Car tesla    =    new Car(2020, 9000, "Tesla", "3", "Blue",35000);
        Car lambo    =    new Car(2009, 119000, "Lambo", "Huracan", "yellow",600000);
        Car camry    =    new Car(2011, 350000, "Toyota", "Camry", "Gray",1500);
        Car mercedes =    new Car(1994, 60000, "Mercedes-Benz", "e-500", "black",15000);
        Car lexus    =    new Car(2017, 99000, "Lexus", "LX-570", "White",70000);
        List<Car> carsInTheStock = new ArrayList<>();
        carsInTheStock.add(tesla);
        carsInTheStock.add(lambo);
        carsInTheStock.add(camry);
        carsInTheStock.add(mercedes);
        carsInTheStock.add(lexus);
        for (Car car : carsInTheStock) {
            //instance
            if (car.mileage < 100000) {
                System.out.print(car.year + " ");
                System.out.print(car.make + " ");
                System.out.print(car.model + " ");
                System.out.println(car.mileage + " ");
            }
        }
        //print out cars(make, model, year) that are newer than 2010;
        for (Car car : carsInTheStock) {
            if (car.year > 2010) {
                System.out.println(car.make + " " + car.model + " " + car.year);
            }
        }
        System.out.println(carsInTheStock);
    }
}



