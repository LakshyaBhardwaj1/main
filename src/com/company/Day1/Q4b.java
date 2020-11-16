package com.company.Day1;

import java.util.Arrays;

public class Q4b {

    static void mergeArr(int[] a1, int[] a2) {
        for (int i=0; i<a1.length; i++) {
            if (a1[i] > a2[0]) {
                swap(a1, a2, i);
                int j=0;
                while(j < (a2.length - 1) && a2[j] > a2[j+1]) {
                    int temp = a2[j];
                    a2[j] = a2[j+1];
                    a2[j+1] = temp;
                    j++;
                }
            }
        }
    }

    static void swap(int[] a1, int[] a2, int i) {
        int temp = a2[0];
        a2[0] = a1[i];
        a1[i] = temp;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 4, 7, 8, 10};
        int[] a2 = {2, 3, 9};
        mergeArr(a1, a2);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
}
