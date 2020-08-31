package myExamples.task_from_Jira;

import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter row matrix");
        int row = scan.nextInt();
        System.out.println("Please enter col matrix");
        int col = scan.nextInt();
        System.out.println("Please enter row2 matrix");
        int row2 = scan.nextInt();
        System.out.println("Please enter col2 matrix");
        int col2 = scan.nextInt();

        //1 2 34 5 67 8 1
        int r1 = 3, c1 = 3;
        int r2 = 3, c2 = 3;
        int[][] firstMatrix = new int[row][col];
        int[][] secondMatrix = new int[row2][col2];
//        int[][] firstMatrix = {{1, 2, 3},{4, 5, 6},{7, 8, 1}};
//        int[][] secondMatrix = {{1, 2, 3},{3, 2, 1},{4, 5 ,2}};
        //int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        //int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };

        // Mutliplying Two matrices
        int[][] product = multiplyMatrices(firstMatrix, secondMatrix, r1, c1, c2);

        // Displaying the result
        displayProduct(product);
    }

    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) {
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return product;
    }

    public static void displayProduct(int[][] product) {
        System.out.println("Product of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}

/**
     *
     *
    As a User I want to input 2 matrix (3*3) arrays as inputs and get the multiplication of both matrix

        Example :
        1. If two matrix are :
        Matrix 1st :
        1 2 3
        4 5 6
        7 8 1

        Matrix 2nd:
        1 2 3
        3 2 1
        4 5 2

        then the multiplication of both matrix should be :
        19 21 11
        43 48 29
        35 35 31

        2. If two matrix are :
        Matrix 1st :
        4 4 4
        2 2 2
        3 3 3

        Matrix 2nd :
        1 4 3
        3 2 4
        1 2 4

        then the multiplication of both matrix should be :
        20 32 44
        10 16 22
        15 24 33

        The input should look like on the picture
 */