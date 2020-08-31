package myExamples.randomRp.looops;

public class LoopEx3 {
    public static void main(String[] args) {
       // Write for and while loops so that they go through the odd integers (from 1 to 19),
        // keeping track of the sum of these integers at each stage, and printing the sum at each stage.
        //Expected Output:  1 4 9 16 25 36 49 64 81 100

        int sum = 0;
        int num = 1;

        while(num <= 19){
            if(num%2==1){
                System.out.println(sum+=num);
            }
            num++;
        }

        for(int num1 = 1;num1<=19;num1++){
            if(num1%2==1){
                sum+=num1;
                System.out.println(sum);
            }
        }
    }
}
