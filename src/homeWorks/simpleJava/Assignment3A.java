package homeWorks.simpleJava;

public class Assignment3A {
    public static void main(String[] args) {
        /*Write a program that creates three variables: an int, a double, and a String.
        Put the value 113 into the first variable, the value 2.71828 into the second,
        and the value "Computer Science" into the third. It does not matter what you
        call the variables... this time.
        Then, display the values of these three variables on the screen, one per line.

        This is room # 113
        e is close to 2.71828
        I am learning a bit about Computer Science

        Your program SHOULD NOT look like this:

        System.out.println( "This is room # 113" );
        System.out.println( "e is close to 2.71828" );
        System.out.println( "I am learning a bit about Computer Science" );

        You must use three variables. Your program will probably have nine lines of code
        inside the curly braces of main().
         */

        int num = 113;
        double sum = 2.71828;
        String str = "Computer Science";

        System.out.println("This is room # "+num);
        System.out.println("e is close to "+sum);
        System.out.println("I am learning a bit about "+str);


    }
}
