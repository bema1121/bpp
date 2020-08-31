package sessions.classes_objects;
//this is a plan that needs to be used for every car object(necessary info for the cars)
//Cars.com -> is an app that sells cars.

public class Car {

    //instance variables are created in the class level
    //not inside any method.
    //instance variables can be used even before the declaration
    //So only methods and instance variables can be used before declaration.
    //every else is executed top to bottom.
    public void printOutYear(){
        year = 1;
        printX();
    }
    public void printX() {
        int x = 10;
        System.out.println("X");
    }
    public void drive(int milesToDrive) {
        mileage+=milesToDrive;
    }
    //public
    //default(when we put nothing)
    //protected
    //private
    //hard coded instance variables(characteristics) of the car
    //means all the cars in the world(app) will have these specific info
    //this needs to be dynamic so that every time I create an object from this class
    //I should be able to give info that is specific to the one car.
//    int year = 2019;
//    private long mileage = 200;
//    protected String make = "Lexus";
//    public String model = "LX570";
//    String color = "White";
//    double price = 40_000.00;
    //instance variable have default values
//    int year;
//    private long mileage;
//    protected String make;
//    public String model;
//    String color;
//    double price;
    int year;
    public long mileage;
    protected String make;
    public String model;
    String color;
    double price;
    //who is the user of this class?
    //Constructor needs to be names same as class name caseSensitive
    //Constructor doesnt have any return type
    //Constructor is used to initialize instance variables
    //Constructor is used to give the object initial state
    public Car(int carYear, long carMileAge, String carMake, String carModel, String carColor, double carPrice) {
        year = carYear;
        mileage = carMileAge;
        make = carMake;
        model = carModel;
        color = carColor;
        price = carPrice;
    }
    //right click
    //generate
    //toString
    //make sure everything is chosen
    //click ok
    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", mileage=" + mileage +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}


