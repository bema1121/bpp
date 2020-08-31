package homeWorks.Arrays;

public class ReverseMultiDimensional {
    public static void main(String[] args) {



        int[][] bigTable = new int[6][5];
        bigTable[0][0] = 10;
        bigTable[0][1] = 5;
        bigTable[0][2] = 4;
        bigTable[0][3] = 12;
        bigTable[0][4] = 1;
        bigTable[1][0] = 1;
        bigTable[1][1] = 10;
        bigTable[1][2] = 5;
        bigTable[1][3] = 13;
        bigTable[1][4] = 2;
        bigTable[2][0] = 2 ;
        bigTable[2][1] = 1;
        bigTable[2][2] = 10;
        bigTable[2][3] = 5;
        bigTable[2][4] = 3;
        bigTable[3][0] = 0;
        bigTable[3][1] = 5;
        bigTable[3][2] = 1;
        bigTable[3][3] = 10;
        bigTable[3][4] = 5;
        bigTable[4][0] = 6;
        bigTable[4][1] = 2;
        bigTable[4][2] = 4;
        bigTable[4][3] = 1;
        bigTable[4][4] = 10;
        bigTable[5][0] = 7;
        bigTable[5][1] = 8;
        bigTable[5][2] = 9;
        bigTable[5][3] = 3;
        bigTable[5][4] = 10;

        System.out.println("------------------");
        for(int row = 0; row < bigTable.length; row++){
            for(int col = 0; col < bigTable[row].length; col++){
                System.out.print(bigTable[row][col] + " | ");
            }
            System.out.println();
            System.out.println("------------------");
        }
        System.out.println();


        for (int row = 0; row < bigTable.length; row++) {
            for(int col = bigTable[row].length-1; col >= 0; col -- ){
                System.out.print(bigTable[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------------");
        }

    }
}
