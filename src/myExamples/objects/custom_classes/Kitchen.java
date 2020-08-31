package myExamples.objects.custom_classes;

public class Kitchen {
    public static void main(String[] args) {

        Microwave mic = new Microwave();
        mic.brand = "LG";
        mic.turnOn();
        mic.heat("pizza with mushroom");
        mic.turnOff();
    }
}
