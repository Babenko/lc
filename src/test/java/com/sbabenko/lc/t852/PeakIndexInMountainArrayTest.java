package com.sbabenko.lc.t852;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PeakIndexInMountainArrayTest {

    @ParameterizedTest
    @MethodSource("mountains")
    void peakIndexInMountainArray(Object rawMountain, int expected) {
        int[] mountain = (int[]) rawMountain;

        var peakIndex = new PeakIndexInMountainArray();
        var result = peakIndex.peakIndexInMountainArray(mountain);
        assertEquals(expected, result);
    }


    private static Stream<Arguments> mountains() {
        return Stream.of(
                Arguments.of((Object) new int[]{0, 1, 0}, 1),
                Arguments.of((Object) new int[]{0, 2, 1, 0}, 1));
    }
}