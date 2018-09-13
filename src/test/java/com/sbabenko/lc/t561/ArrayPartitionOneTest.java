package com.sbabenko.lc.t561;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class ArrayPartitionOneTest {

    @ParameterizedTest
    @MethodSource("partition")
    void arrayPairSum(int[] array, int expected) {

        var partition = new ArrayPartitionOne();
        var result = partition.arrayPairSum(array);

        Assertions.assertEquals(expected, result);
    }


    private static Stream<Arguments> partition() {
        return Stream.of(Arguments.of((Object) new int[] {1, 4, 3, 2}, 4), Arguments.of((Object) new int[] {3}, 3));
    }


}