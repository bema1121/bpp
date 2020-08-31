package sessions.Loops;

public class PrintNumberLoopReader {

    public boolean process(int number){
        boolean returnValue = true;
        for(int i = 2;  i <= number/2; i++){
            if(number % i == 0){
                returnValue = false;
            }else{
                continue;
            }
        }
        return returnValue;
    }
    public void printResult(int number){
        PrintNumberLoopReader p = new PrintNumberLoopReader();
        boolean isPrime = p.process(number);
        if(isPrime){
            System.out.println("Number "+number+" is a Prime number");
    }else{
            System.out.println("Number "+number+" is not a Prime number");
        }
}

    public static void main(String[] args) {

        PrintNumberLoopReader p = new PrintNumberLoopReader();
        p.printResult(10);
        p.printResult(13);
        p.printResult(7);
    }
}