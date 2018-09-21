package com.sbabenko.lc.t557;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordsInStringT {

    public String reverseWords(String s) {

        return Stream.of(s.split("\\s"))
                .map(this::reverse)
                .collect(Collectors.joining(" "));
    }

    private String reverse(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
