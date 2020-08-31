package myExamples.randomRp.Methods;

public class OperatorPrecedence {
    public static void main(String[] args) {
        OperatorPrecedence op = new OperatorPrecedence();

        System.out.println(op.isTrue(5,6,10));
    }
    public boolean isTrue(int a, int b, int d){
        int sum = d + b;
        return a > b && 45 <= sum || sum > a + b && d > 90;
    }
}
