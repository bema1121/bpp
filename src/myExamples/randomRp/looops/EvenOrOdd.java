package myExamples.randomRp.looops;

public class EvenOrOdd {
    public static void main(String[] args) {
        //using for loop: 1 - 100
        //1)print all even numbers in same line
        //2) print all odd numbers in same line
        //3)sumOffOdds, sumOfEvens - calculate them
        //and print out after the loop

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) { //check if it is even
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");

            }
        }
        int sumOfOdds = 0;
        int sumOfEvens = 0;
        for(int i = 1 ; i <= 100; i++){
            if(i % 2 == 0){
                sumOfEvens+=i;
            }else{
                sumOfOdds+=i;
            }
        }



    }
}
