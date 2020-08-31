package sessions.JavaMethods;

import java.util.Scanner;

public class USingScannerWithMethods {

    //If I need to take input from user
    //and use the values entered from user
    //to run(call) methods
    public static void main(String[] args) {
        //ask user to give you his car kilometerage
        //then return the mileage

        //why i have to take int?
        System.out.println("Please enter kms");
        Scanner scanner= new Scanner(System.in);
        double kilometre = scanner.nextDouble();


        //we can pass hard coded values to method params
        //and variables that are of the same data type
        double mileAgeResult = getMeCarMileage(kilometre);
       System.out.println(mileAgeResult);

    }

    public static double getMeCarMileage(double km) {
        return km / 1.60934;

    }
}
