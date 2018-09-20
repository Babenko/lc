package com.sbabenko.lc.t905;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayByParityTest {

    @ParameterizedTest
    @MethodSource("arrays")
    void sortArrayByParity(int[] array, int[] excpected) {

        var sortArrayByParity = new SortArrayByParity();

        var result = sortArrayByParity.sortArrayByParity(array);

        Assertions.assertTrue(Arrays.equals(result, excpected));
    }


    private static Stream<Arguments> arrays() {
        return Stream.of(
                Arguments.of((Object)new int[]{3,1,2,4}, (Object)new int[]{2,4,3,1}));
    }
}