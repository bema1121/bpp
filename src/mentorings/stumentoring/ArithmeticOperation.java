package mentorings.stumentoring;

public class ArithmeticOperation {
    int addition, multiplication,division,substraction, modulus;

    public int addition(int a, int b){
        addition = a + b;
        return addition;
    }
    public int multiplication (int a, int b){
        multiplication = a * b;
        return multiplication;
    }
    public int division (int a, int b){
        division = a /b;
        return division;

    }
    public int substraction (int a, int b){
        substraction = a - b;
        return substraction;
    }
    public int modulus(int a, int b){
        modulus = a % b;
        return modulus;
    }
}
