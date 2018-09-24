package com.sbabenko.lc.t908;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SmallestRangeOneTest {

    @ParameterizedTest
    @MethodSource("ranges")
    void smallestRangeI(int[] array, int k, int expected) {

        var smallestRange = new SmallestRangeOne();
        var result = smallestRange.smallestRangeI(array, k);

        assertEquals(expected, result);
    }

    private static Stream<Arguments> ranges() {
        return Stream.of(
                Arguments.of((Object)new int[]{1}, 0, 0),
                Arguments.of((Object)new int[]{0, 10}, 2, 6),
                Arguments.of((Object)new int[]{1, 3, 6}, 3, 0),
                Arguments.of((Object)new int[]{2, 5, 10, 15}, 500, 0),
                Arguments.of((Object)new int[]{4, 7, 4}, 4, 0),
                Arguments.of((Object)new int[]{3, 2, 4, 2}, 1, 0),
                Arguments.of((Object)new int[]{9, 9, 2, 8, 7}, 4, 0));
    }
}