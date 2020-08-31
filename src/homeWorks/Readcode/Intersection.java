package homeWorks.Readcode;

import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int[] x = new int[]{2, 5, 3, 7};
        System.out.println("The first array is " + "  ");
        System.out.println(Arrays.toString(x));
        //System.out.println("A".charAt(10));  //RunTime exception
        int[] y = {5, 2, 9, 0, 1};
        System.out.println("The second array is " + "  ");
        System.out.println(Arrays.toString(y));
        intersection(x, y);
    }
    public static int[] intersection(int[] x, int[] y) {
        int i, j, k, c = 0, w;
        //int[] x = {2, 5, 3, 7};
        //int[] y = {5, 2, 9, 0, 1};
        int[] z = new int[x.length + y.length];
        for (i = 0; i < (x.length); i++) {
            for (j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    z[c] = x[i];
                    c++;
                } else
                    continue;
            }
        }
        System.out.println("Intersection of two  array is " + "  ");
        System.out.println(Arrays.toString(z));
        System.out.println("            ");
        return z;
    }
}





