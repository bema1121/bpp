package sessions.JavaMethods;
//Calculator methods. functionalities
public class Calculator {
    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();

        // myCalculator.sum(20,40);
        int result = myCalculator.addTwoNum(30, 12);
        System.out.println(result);

        int result1 = myCalculator.addTwoNum(40, 20);
        System.out.println(result1);

        int finalResult = myCalculator.addTwoNum(result, result1);
        System.out.println(finalResult);

        int taxToBePaid = myCalculator.calculateTax(100000, true);
        System.out.println(taxToBePaid);

        // int taxToBePaidUnmarried = myCalculator.calculateTax()

        //start from somewhere with initials values
        //pass on the result of the methods to another method.
        //keep doing that until you reach the final result of the program.
        //returning a result which is int


    }


    //please write a function(method)
    //which will add two numbers
    public void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    //int is a return type.
    //return type means -> result of the function
    //return type means -> result of the function
    //30        12
    public int addTwoNum(int num1, int num2) {

        return num1 + num2; //-> num1 + num2
        //signals the give this result.
        //Or this is the result of the function

    }

    //execute(run) the logic and return the result.
    //add num1 to num2
    //return type of method does not affect params


    public int calculateTax(int salary, boolean isMarried) {
        int tax = 0;
        if (isMarried) {
            tax = salary * 5 / 100;

        } else {
            tax = salary * 30 / 100;
        }
        return tax;

    }

    public int multiplyNumbers(int num1 , int num2){
       return num1 * num2;
    }


}
