package com.sbabenko.lc.t1342;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStepsToReduceANumberToZeroTest {

    @ParameterizedTest
    @MethodSource("numbers")
    void numberOfSteps(int num, int expected) {
        var numOfSteps = new NumberOfStepsToReduceANumberToZero();

        int result = numOfSteps.numberOfSteps(num);

        assertEquals(result, expected);
    }

    private static Stream<Arguments> numbers() {
        return Stream.of(
                Arguments.of(14, 6), Arguments.of(8, 4), Arguments.of(123, 12));
    }
}