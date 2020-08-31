package myExamples.randomRp.looops.NestedLoop;

public class TriangleWithNumbers {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            //System.out.print(i);
            for(int j = i ; j >= i; j--) {
                System.out.print(j + " ");
                //System.out.print(i);
            }System.out.println();
        }
    }
}
