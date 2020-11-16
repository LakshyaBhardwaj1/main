package com.company.Day2;

import java.util.ArrayList;
import java.util.List;

public class Q8a {

    static List<List<Integer>> generatePascal(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows==0)
            return res;
        for (int i=0; i<numRows; i++) {
            List<Integer> subArr = new ArrayList<>();
            if (!res.isEmpty()) {
                List<Integer> prev = res.get(i - 1);
                for (int index = 0; index < prev.size(); index++) {
                    if (index == 0) {
                        subArr.add(1);
                    } else {
                        subArr.add(prev.get(index-1) + prev.get(index));
                    }
                }
            }
            subArr.add(1);
            res.add(subArr);
        }
        return res;
    }

    static void loop(int k) {
        for (int i = 0; i < k; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int i = 7;
//        System.out.println(generatePascal(i));
        loop(i);
    }
}
