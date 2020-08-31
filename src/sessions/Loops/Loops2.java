package sessions.Loops;

public class Loops2 {

        public static void main(String[] args) throws InterruptedException {
            printStars(8);
        }
        public static void printStars(int i) throws InterruptedException {
            String str = "*";
            while (i > 0){
                System.out.println(str);
                Thread.sleep(500);// Pauses Java execution
                str += "*";
                i--;
            }
        }
    }