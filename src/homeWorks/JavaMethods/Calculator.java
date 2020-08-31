package homeWorks.JavaMethods;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculate = new Calculator();
        calculate.addNumbers(21,3);
        calculate.divideNumbers(21,3);
        calculate.multiplyNumbers(21,3);
        calculate.subtractNumbers(21,3);

    }
    public int addNumbers(int a, int b){
        int result1;
        result1 = a + b;
        System.out.println("Add numbers are:  "+result1);
        return result1;

    }
    public int divideNumbers(int a,int b){
        int result2;
        result2 = a / b;
        System.out.println("Divided numbers are: "+result2);
        return result2;
    }
    public int multiplyNumbers(int a, int b){
        int result3;
        result3 = a * b;
        System.out.println("Multiplied numbers are: "+result3);
        return result3;
    }
    public int subtractNumbers(int a, int b) {
        int result4;
        result4 = a - b;
        System.out.println("Subtract numbers are: "+result4);
        return result4;
    }
}
