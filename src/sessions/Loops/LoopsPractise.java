package sessions.Loops;

public class LoopsPractise {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println("cough");
        //DRY don't repeat yourself

        int cookiesToBake = 100;
        int numberOfQMarks = 8;


        while (true) {
            System.out.println("Bake cookie");
            cookiesToBake = cookiesToBake - 1;


            while (numberOfQMarks > 0) {
                System.out.println(numberOfQMarks);
                //Thread.sleep(300); //Pauses the execution for given num of millis
                numberOfQMarks--;


            }
        }

    }}





