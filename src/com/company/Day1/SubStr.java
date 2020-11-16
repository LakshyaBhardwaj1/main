package com.company.Day1;

import java.util.ArrayList;

public class SubStr {

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n-1 && j < m-1)
        {
            while(arr1[i] == arr1[i+1])
                i++;
            while(arr2[j] == arr2[j+1])
                j++;
            if (arr1[i] < arr2[j])  {
                res.add(arr1[i]);
                i++;
            }
            else if (arr2[j] < arr1[i]) {
                res.add(arr2[j]);
                j++;
            }
            else
            {
                res.add(arr2[j]);
                i++; j++;
            }
        }

      /* Print remaining elements of
         the larger array */
        while(i < m)
            res.add(arr1[i++]);
        while(j < n)
            res.add(arr2[j++]);

        return res;
    }

    public  static void main(String[] a) {
        int[] arr1 = new int[] { 1, 2, 3};
        int[] arr2 = new int[] { 4, 5 };
//        System.out.println(findUnion(arr1, arr2, arr1.length, arr2.length));

        String str[] = "i.like.this.program.very.much".split("\\.");
        StringBuilder ans = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.println(str[i]);
            ans.append(str[i]);
            if (i!=0) {
                ans.append(".");
            }
        }
        System.out.print(ans);

        int arr[][] = new int[3][2];
        System.out.println("len" + arr.length);

    }
}
