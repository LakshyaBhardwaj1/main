package com.company.Day2;

import java.util.Arrays;

public class Q7a {

    static void setZeroes(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    int k = 0;
                    while(k<matrix[0].length) {
                        matrix[i][k] = matrix[i][k] != 0 ? -1 : matrix[i][k];
                        k++;
                    }
                    k = 0;
                    while(k<matrix.length) {
                        matrix[k][j] = matrix[k][j] != 0 ? -1 : matrix[k][j];
                        k++;
                    }
                }
            }
        }

        for(int i=0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] a) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
