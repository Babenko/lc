package com.sbabenko.lc.t728;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

class SelfDividingNumbersTest {

    @ParameterizedTest
    @MethodSource("dividingNumber")
    void selfDividingNumbers(int left, int right, Object wrappedExpected) {

        var divider = new SelfDividingNumbers();
        var expected = Arrays.stream((int[]) wrappedExpected).boxed().collect(toList());
        var result = divider.selfDividingNumbers(left, right);

        assertIterableEquals(expected, result);
    }


    private static Stream<Arguments> dividingNumber() {
        return Stream.of(Arguments.of(1, 22, (Object)new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22}));
    }


}