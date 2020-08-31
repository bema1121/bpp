package sessions.classes_objects.covariant;

import java.time.LocalDate;

public class VehicleMainDriver {

    public static void main(String[] args) {
        //create Vehicle object
        Vehicle vehicle = new Vehicle(4, "black", 1234334, true);
        Object vehicle2 = new Vehicle(5,"White",323456,false);
        //create registered obj
        RegisteredVehicle registeredVehicle = new RegisteredVehicle(4,"Red",13435454,true,
                "AN123", LocalDate.of(2020,5,2),LocalDate.of(2021,5,2));
        Vehicle registeredVehicle2 = new RegisteredVehicle(4,"Blue",23435454,true,
                "ABC222", LocalDate.of(2020,4,22),LocalDate.of(2021,4,22));
        //create Bike obj
        Bike bike = new Bike(2,"black",1213223,"AC2323",LocalDate.of(2020,4,22),
                LocalDate.of(2021,4,22),
                "Sport","Yamaha",1000);







    }
}
