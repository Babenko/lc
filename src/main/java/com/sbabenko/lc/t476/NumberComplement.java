package com.sbabenko.lc.t476;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberComplement {

    public int findComplement(int num) {

        int currentVal = num;
        List<Integer> list = new ArrayList<>();

        while (currentVal > 0) {
            list.add(currentVal & 1);
            currentVal = currentVal >> 1;
        }
        Collections.reverse(list);
        return Integer.parseInt(list
                .stream()
                .map(elem -> elem ^ 1)
                .map(String::valueOf)
                .collect(Collectors.joining("")), 2);

    }
}
