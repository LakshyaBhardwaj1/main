package com.company.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leet2 {

    static List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> toBeSearched = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int startIndex = 0, currLength = 0;
        for (Character ch : p.toCharArray()) {
            if(toBeSearched.containsKey(ch)) {
                toBeSearched.put(ch, toBeSearched.get(ch) + 1);
            } else {
                toBeSearched.put(ch, 1);
            }
        }

        for(int i=0; i < s.length(); i++) {
            if(toBeSearched.containsKey(s.charAt(i))) {
                if(toBeSearched.get(s.charAt(i)) > 0) {
                    ++currLength;
                    toBeSearched.put(s.charAt(i), toBeSearched.get(s.charAt(i)) - 1);
                    if(currLength == p.length()) {
                        result.add(startIndex);
                        for (Character ch : p.toCharArray()) {
                            if(toBeSearched.containsKey(ch)) {
                                toBeSearched.put(ch, toBeSearched.get(ch) + 1);
                            } else {
                                toBeSearched.put(ch, 1);
                            }
                        }
                        i = startIndex;
                        ++startIndex;
                        currLength = 0;

                    }
                } else {
                    i = startIndex;
                    ++startIndex;
                    currLength = 0;
                    for (Character ch : p.toCharArray()) {
                        if(toBeSearched.containsKey(ch)) {
                            toBeSearched.put(ch, toBeSearched.get(ch) + 1);
                        } else {
                            toBeSearched.put(ch, 1);
                        }
                    }
                }
            } else {
                i = startIndex;
                ++startIndex;
                currLength = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("abaacbabc", "abc"));
    }
}