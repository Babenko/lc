package com.sbabenko.lc.t728;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {

        return IntStream.range(left, right + 1)
                .filter(this::dividedNumber)
                .boxed()
                .collect(Collectors.toList());
    }

    private boolean dividedNumber(int n) {
        int temp = n;
        while (temp > 0) {
            int last = temp % 10;
            temp /= 10;
            if (last == 0 || n % last != 0) {
                return false;
            }
        }
        return true;
    }
}
