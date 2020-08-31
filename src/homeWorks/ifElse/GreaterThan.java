package homeWorks.ifElse;

public class GreaterThan {
    /**
     * Trying if-else statement.
     */
    // Save as "CheckPassFail.java"
    public static void main(String[] args) {  // Program entry point
        int mark = 49;   // Set the value of "mark" here!
        System.out.println("The mark is " + mark);
//       Write a program called CheckPassFail which prints
//       "PASS" if the int variable "mark" is more than or equal to 50; or prints
//       "FAIL" otherwise. The program shall always print “DONE” before exiting.
//
//Hints
//Use >= for greater than or equal to comparison. Please fill out the dots with correct words.

        // if-else statement
        if (mark >= 50) {
            System.out.println("PASS" );
        } else {
            System.out.println("FAIL");
        }
        System.out.println( "DONE" );
    }
}


