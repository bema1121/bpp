package myExamples.randomRp.looops.NestedLoop;

public class UtopianTree {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int year = 1; year <= 6; year++) {
                System.out.println("year " + year + " - growth " + i + "cm");
                for (int j = 1; j <= i; j++) {
//                    System.out.println("tree size: " + j + "cm");

                }
                //System.out.println("tree size: " + j + "cm");
            }
        }
    }}
