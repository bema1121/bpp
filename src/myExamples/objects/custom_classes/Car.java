package myExamples.objects.custom_classes;

public class Car {

    String make;
    String model;
    int currentSpeed;
    String color;

    public void printCarInfo() {
        String info = "Car make[" + make + "], model[" + model + "],currentSpeed[" +
                currentSpeed + "],color[" + color + "]";
        System.out.println(info);
    }
    public void showCurrentSpeed(int speedLimit) {
        if (currentSpeed <= speedLimit) {
            System.out.println(make + " is driving at " + currentSpeed + " mph, following the speed limit - "
                    + speedLimit);

        } else {
            System.out.println(make + " is driving at " + currentSpeed + " mph, over the speed limit - " +
                    speedLimit);
        }

        //drive Ford Mustang is driving

    }
    public void drive() {
        System.out.println(make + " " + model + " is driving ...");


    }
    public void accelerate(int mph) {
        currentSpeed = currentSpeed + mph; // or currentSpeed+=mph;
       // System.out.println(make + " " + model + " " + currentSpeed + " is increasing by " + mph);


    }

}
