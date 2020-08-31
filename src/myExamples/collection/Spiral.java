package myExamples.collection;

import java.util.ArrayList;
import java.util.List;

public class Spiral {
    public static void main(String[] args) {
    }
    public List<Integer> spiralTraverse(int[][] array) {
            List<Integer> spiral = new ArrayList<Integer>();
            //  for (int spiralStart = 0; spiralStart < array.length;)
            for (int firstRow = 0;  firstRow < array[0].length; firstRow++){
                spiral.add(array[0][firstRow]);
            }
            for(int lastColumn = 1; lastColumn < array.length; lastColumn++){
                spiral.add(array[lastColumn][array[0].length-1]);
            }
            for (int lastRow = array[0].length-2;lastRow > 0; lastRow--){
                spiral.add(array[array.length-1][lastRow]);
            }
            for (int firstcolumn = array.length-2; firstcolumn > 0; firstcolumn--){
                spiral.add(array[firstcolumn][0]);
            }
            for (int secondRow = 1; secondRow < array[0].length-1; secondRow++){
                spiral.add(array[1] [secondRow]);
            }
            for(int column3 = 2; column3 < array.length-1; column3++){
                spiral.add(array[column3][array[0].length-2]);
            }
            for (int row3 = array[0].length-3; row3 > 0; row3--){
                spiral.add(array[array.length-2][row3]);
            }
            return spiral;
    }
}
