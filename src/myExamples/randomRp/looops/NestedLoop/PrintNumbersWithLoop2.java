package myExamples.randomRp.looops.NestedLoop;

public class PrintNumbersWithLoop2 {
    public static void main(String[] args) {
        //print triangle by using nested loops
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("************************");
        for(int i = 10; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
