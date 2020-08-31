package homeWorks.Loops;

public class SumRunningInt {
    public static void main(String[] args) {
        /*Write a program called Sum Running Int to produce the sum of 1, 2, 3,
        ...,to 100. Store 1 and 100 in variables lowerbound and upperbound,
                so that we can change their values easily.The output shall look like:

                 The sum of 1 to 100 is 5050

         */
        int sum = 0;
        int lowerbound = 1;
        int upperbound = 100;

        for (int number = lowerbound; number <= upperbound; ++number) {
            sum += number;
        }
        System.out.println("The sum of " + lowerbound + " to " + upperbound + " is " + sum);

    }
}


