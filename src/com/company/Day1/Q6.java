package com.company.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6 {

    static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if(intervals == null || intervals.length == 0)
            return res.toArray(new int[0][]);
        // Sort the array
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int[] i : intervals) {
            if (i[0] <= end) {
                end = Math.max(i[1], end);
            } else {
                res.add(new int[] { start, end });
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[] { start, end });
        return res.toArray(new int[0][]);
    }

    public static void main(String[] a) {
        int[][] intervals = new int[][] { { 2, 6 }, { 1, 3 } };
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
