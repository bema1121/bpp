package homeWorks.simpleJava;

public class Assignment4CArithmeticTest {
    public static void main(String[] args) {

        // Declare an int variable number1 and initialize it to 98
        // Declare an int variable number2 and initialize it to 5
        //? sum, difference, product, quotient, remainder;  // Declare 5 int variables to hold results

        // Perform arithmetic Operations
        int number1 = 98;
        int number2 = 5;
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int division = number1 / number2;
        int remainder = number1 % number2;


        System.out.println("The sum, difference, product, division and remainder of "
                +number1+" and "+number2+" are ");
        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+difference);
        System.out.println("Product: "+product );
        System.out.println("Division: "+division);
        System.out.println("Remainder: "+remainder);

    }
}

