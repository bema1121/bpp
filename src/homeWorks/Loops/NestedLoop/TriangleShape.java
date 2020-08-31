package homeWorks.Loops.NestedLoop;

public class TriangleShape {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            for(int j=0;j<i;j++){
                System.out.print("*");
              continue;
            }
            System.out.println();
        }
        System.out.println();
    }
}


