package homeWorks.Loops;

public class WhileLoopReadCode {
    public static void main(String[] args) {
        WhileLoopReadCode redj = new WhileLoopReadCode();
       redj.breakDigits(2019);
        redj.breakDigits(7891);

    }
    public void breakDigits(int num){
        int temp,digit,count = 0;
        temp = num;

        while( num > 0){
            num = num /10;
            count++;
        }

        while(temp>0){
            digit = temp% 10;
            System.out.println("Digit at place "+count+" is: "+digit);
            temp = temp/10;
            count--;
        }
    }
}
