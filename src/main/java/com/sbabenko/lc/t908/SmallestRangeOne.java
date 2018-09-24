package com.sbabenko.lc.t908;

import java.util.Arrays;

public class SmallestRangeOne {

    public int smallestRangeI(int[] A, int K) {

        Arrays.sort(A);
        int min = A[0];
        int max = A[A.length - 1];

        if (min + K <= max -K) {
            return max - K - (min + K);
        }

        return 0;
    }
}
