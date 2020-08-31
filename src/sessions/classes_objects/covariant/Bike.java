package sessions.classes_objects.covariant;

import java.time.LocalDate;

public class Bike extends RegisteredVehicle{

    private String type;
    private String brand;
    private double price;

    public Bike(int numOfVehicles, String color, long vin,  String registrationNumber, LocalDate registrationDate, LocalDate expirationDate, String type, String brand, double price) {
        super(numOfVehicles, color, vin, false, registrationNumber, registrationDate, expirationDate);
        this.type = type;
        this.brand = brand;
        this.price = price;


    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
