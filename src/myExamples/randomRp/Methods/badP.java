package myExamples.randomRp.Methods;

public class badP {

    public static void main(String[] args) {
        int[] pro = {1,1,1,1,0,0,0,0};
        int lim = 2;
        System.out.println(badP(pro, lim));

    }

    public static boolean badP(int[] products, int limit) {
        int counter = 0;
        for (int i = 0; i <= products.length - 1; i++) {
            if (products[i] == 0) {
                counter++;
            }
            if (counter > limit) {
                return false;

            }
        }
        return true;
    }
}


