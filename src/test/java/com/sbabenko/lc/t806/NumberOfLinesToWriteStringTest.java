package com.sbabenko.lc.t806;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfLinesToWriteStringTest {

    @ParameterizedTest
    @MethodSource("lines")
    void numberOfLines(int[] widths, String line, int[] expected) {

        var numberOfLinesToWriteString = new NumberOfLinesToWriteString();

        var result = numberOfLinesToWriteString.numberOfLines(widths, line);

        Assertions.assertTrue(Arrays.equals(result, expected));
    }

    private static Stream<Arguments> lines() {
        return Stream.of(
                Arguments.of((Object)new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                        "abcdefghijklmnopqrstuvwxyz", (Object)new int[]{3, 60}),
                Arguments.of((Object)new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                        "bbbcccdddaaa", (Object)new int[]{2, 4}));
    }
}