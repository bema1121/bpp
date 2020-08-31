package homeWorks.ifElse;

public class PrintNumberInWord {



   // Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
    // "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
    // Use (a) a "nested-if" statement;

    /**
     * Trying nested-if and switch-case statements.
     */

        public static void main(String[] args) {
            int number = 5;  // Set the value of "number" here!

            // Using nested-if
            if (number == 1) {   // Use == for comparison
                System.out.println("ONE" );
            } else if (number == 2 ) {
                System.out.println("TWO");
            } else if (number == 9) {
                System.out.println("NINE");

            } else {
                System.out.println("OTHER");
            }}}