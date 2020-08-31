package mentorings.sofia;

public class BMI {

    /* create an app that would calculate the body mass index
BMI - body mass index
variables:
persons name
weight
height
age
1 - constructor (name, age, height, weight)
2 - const(name, height, weight)---> make it call the first constructor
methods:
getBMI():double
getStatus: string
    */
    private String name; // bad practice to make instance variable as public
    private int age;
    public double weight;
    private double height;
    public static int count = 0;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++; // will be incremented each time constructor is called
    }

    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height); // must be on the first line
    }

    public double getBMI() {
        return Math.round(weight / Math.pow(height, 2)); //  17,38274893 ==> 17,38
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) return "Under fat";
        else if (bmi >= 18.5 && bmi < 25) return "Healthy";
        else if (bmi >= 25 && bmi < 30) return "Over fat";
        return "Obese";
    }
}