package com.sbabenko.lc.t893;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GroupSpecialEquivalentString {

    private static final int OFFSET = 97;

    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String str : A) {
            int[] odd = new int[26], even = new int[26];
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    even[str.charAt(i) - OFFSET]++;
                } else {
                    odd[str.charAt(i) - OFFSET]++;
                }
            }
            set.add(Arrays.toString(odd) + Arrays.toString(even));
        }
        return set.size();
    }

}
