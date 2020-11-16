package com.company.Day1;

import java.util.Arrays;

public class dupZero {

    static void duplicateZeros(int[] arr) {
        for (int i=0; i< arr.length-1; i++) {
            if (arr[i] == 0) {
                for (int j=arr.length-1; j>i+1; j--) {
                    arr[j] = arr[j-1];
                }
                arr[i+1] = 0;
                i++;
                System.out.println(Arrays.toString(arr));
            }
        }
    }
     public static void main(String[] a) {
        int [] arr = new int[] {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
     }

}
