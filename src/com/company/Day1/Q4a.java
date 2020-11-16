package com.company.Day1;

import java.util.Arrays;

public class Q4a {

    static void mergeArr(int[] a1, int[] a2) {
        int newSize = a1.length + a2.length;
        int[] newArr = new int[newSize];
        int i=0;
        for(int j=0; j<a1.length; i++,j++)
            newArr[i] = a1[j];
        for(int j=0; j<a2.length; i++,j++)
            newArr[i] = a2[j];
        Arrays.sort(newArr);

        i=0;
        for(;i<a1.length; i++)
            a1[i] = newArr[i];

        for(int j=0;i<newSize; i++,j++)
            a2[j] = newArr[i];
    }

    public static void main(String[] args) {
        int[] a1 = {1, 4, 7, 8, 10};
        int[] a2 = {2, 3, 9};
        mergeArr(a1, a2);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
}
