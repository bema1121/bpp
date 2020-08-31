package sessions.Loops;

public class NestedLoop {
    public static void main(String[] args) {
        int counter = 0;
        for (int outer = 1; outer <= 6; ++outer) {
            for (int j = 0; j <= 2; j++) {
                System.out.println("outer = " + outer + " inner = " + j);
                counter++;
            }
        }
            System.out.println(counter);


        //inner loop will run itself completely once for every iteration of the outer loop
        //inner loop starts itself from beginning for every iteration for the outer loop



        //I want to print out
        //1
        //12
        //123
        //1234

        //Pseudocode => plan for your code.
        //verbal plan for your code
        //how many lines do wee need to print out
        //number of lines 4
        //for until 4 start from 1
        //every loop 1

        //# # # # #
        // # # # # #
        //# # # # #
        // # # # # #

        String number ="";

        for(int row = 1; row <= 5;row++){
            for(int column = 1; column <= 5; column++){
                System.out.print("# ");
            }
            System.out.println();
        }

    }
}
