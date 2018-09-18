package com.sbabenko.lc.t867;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TransposeMatrixTest {

    @ParameterizedTest
    @MethodSource("matrix")
    void transpose(int[][] matrix, int[][] expected) {

        var matrixOp = new TransposeMatrix();
        var result = matrixOp.transpose(matrix);

        Assertions.assertEquals(expected.length, result.length);
        Assertions.assertEquals(expected[0].length, result[0].length);

        for (int x = 0; x < result.length; x++) {
            for (int y = 0; y < result[0].length; y++) {
                Assertions.assertEquals(expected[x][y], result[x][y]);
            }
        }

    }


    private static Stream<Arguments> matrix() {
        return Stream.of(
                Arguments.of((Object)new int[][]{{1, 2, 3},{4, 5, 6}, {7, 8, 9}},
                        (Object)new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}));
    }
}