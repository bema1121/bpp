package mentorings.sofia;

public class TestBmi {
    public static void main(String[] args) {


    BMI obj1 = new BMI("Sofia", 51, 1.71);
        System.out.println(obj1.getBMI());
        System.out.println(obj1.getStatus());
        System.out.println(BMI.count);
    obj1.weight = 72;
        System.out.println(obj1.getBMI());
        System.out.println(obj1.getStatus());
    BMI obj2 = new BMI("Sofia", 51, 1.71);
    BMI obj3 = new BMI("Sofia", 51, 1.71);
        System.out.println(BMI.count); // count how many objects was created
}
}
