package com.company.Day2;

import java.util.Arrays;

public class Q7b {

    static void setZeroes(int[][] matrix) {
        boolean col0 = true;
        int rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0 && col0) {
                col0 = false;
            }
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
//        System.out.println(Arrays.deepToString(matrix));

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j > 0; j--) {
                if (matrix[i][j] != 0 && (matrix[i][0] == 0 || matrix[0][j] == 0)) {
                    matrix[i][j] = 0;
                }
            }
            if (!col0) {
                matrix[i][0] = 0;
            }
        }

    }

    public static void main(String[] a) {
        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
