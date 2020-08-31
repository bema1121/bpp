package myExamples.randomRp.looops;

public class Loop {
    public static void main(String[] args) {
        //Write for and while loops so that they add up the even numbers between 1 and 20 and prints it
        //Expected Output:  110
        int sum = 0;
        for (int num = 1; num <= 20; num++) {
            if (num % 2 == 0) {
                sum += num;



            }
        }



        int num = 1;
        while (num <= 20) {
            if (num % 2 == 0) {
                sum+=num;
            }
            num++;
        }
        System.out.println(sum);
    }

}