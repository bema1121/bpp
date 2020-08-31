package sessions.Loops;

public class OptionalLabelAndBreak {

    //break statement can be used to stop(exit, terminate) the
    //loop at any time
    public static void main(String[] args) {

        //print out hello 10 times
        for(int i = 0;i<=10;i++){ //i++
            System.out.println("Hello ");
            break;             //break statement terminates the loop
                               //return statement specifies the end of the method
                               //return stop the whole method.

        }

        //you have stream of shoes. There are 100 of them. you need to choose one of them
        //based on a number.
        //shoe is number 25; => I want say great choice and stop the loop

        for(int i = 1;i <= 24;i++){

            System.out.println("Loop number "+i);
            if(i == 25) {
                System.out.println("great choice");
                break;
            }
            System.out.println("Loop number "+i+ " end of the loop");
        }

        //given String print a program to print out each character of the String until you see X
        //ex: SpaceX
        //Space
        //DevX School
        //Dev

        String str = "SpaceX";

        for(int i = 0; i <= str.length();i++ ){
            if(str.charAt(i) == 'X'){
                break;
            }
            System.out.println(str.charAt(i));
        }

        //write a program which will find me first number evenly divisible by 13
        //number is between 1 and 100







    }
}
