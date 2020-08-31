package myExamples.randomRp.looops.NestedLoop;

public class PrintNumbersWithLoop {
    public static void main(String[] args) {


        //this is just to print numbers from1 to 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ");

        }
        //outer loop
        for(int k =1 ; k <= 3; k++){
        for (int j = 0; j <= 2; j++) {
            //inner loop
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
            System.out.println("****************");
    }
}}
//print 5 rows of letters from 'a'-'z' , in betweeen line print
//print stars
//for(char letter = 'a'; letter <= 'z' ; letter++){
//