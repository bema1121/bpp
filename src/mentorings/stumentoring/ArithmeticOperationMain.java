package mentorings.stumentoring;

import java.util.Scanner;

public class ArithmeticOperationMain {
    public static void main(String[] args) {

        int a , b;
        int addition1, multiplication1,division1,substraction1, modulus1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two integers numbers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        ArithmeticOperation arithmetic = new ArithmeticOperation();

        addition1 = arithmetic.addition(a, b);
        multiplication1 = arithmetic.multiplication(a,b);
        division1 = arithmetic.division(a,b);
        substraction1 = arithmetic.substraction(a,b);
        modulus1 = arithmetic.modulus(a,b);

        System.out.println("The addition result is : "+addition1);
        System.out.println("The multiplication result is : "+multiplication1);
        System.out.println("The division result is : "+division1);
        System.out.println("The subtraction result is : "+substraction1);
        System.out.println("The modulo result is : "+modulus1);







    }
}
