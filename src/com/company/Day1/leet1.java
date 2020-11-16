package com.company.Day1;

import javax.xml.transform.Templates;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leet1 {

    static int bitwiseComplement(int N) {
        int sum = 0;
        long pow=1;
        // Do, while is used because if N is 0, then it has to add 1 and not go directly out of the loop.
        int step=0;
        do {
            step++;
            if(N%2==0) sum+=pow;
            System.out.println("For step : " + step + " --> Value of N " + N + " and sum : " + sum);
            N = (N>>1);
            pow*=2;
            System.out.println("For step : " + step + " --> Value of N after shifting " + N + " with pow : " + pow);
        } while(N !=0 );
        return sum;
    }

    // Driver program
    public static void main(String[] args)
    {
        System.out.println(bitwiseComplement(50));
    }
}