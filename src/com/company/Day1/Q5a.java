package com.company.Day1;

public class Q5a {

    private static void sum(int[] arr) {
        int max_sum = Integer.MIN_VALUE, sum;
        for(int i=0; i< arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                sum = 0;
                for(int k=i; k<j; k++) {
                    sum+= arr[k];
                    if(sum>max_sum) {
                        max_sum = sum;
                    }
                }
            }
        }
        System.out.println(max_sum);
    }

    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        sum(arr);
    }
}
