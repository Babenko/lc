package com.sbabenko.lc.t883;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ProjectionAreaOf3DShapesTest {

    @ParameterizedTest
    @MethodSource("shapes")
    void projectionArea(Object rawShape, int expected) {

        int[][] shape = (int[][]) rawShape;

        var projectionAreaOf3DShapes = new ProjectionAreaOf3DShapes();

        int result = projectionAreaOf3DShapes.projectionArea(shape);

        Assertions.assertEquals(expected, result);
    }


    private static Stream<Arguments> shapes() {
        return Stream.of(
                Arguments.of((Object)new int[][]{{1, 2},{3, 4}}, 17),
                Arguments.of((Object)new int[][]{{2}}, 5),
                Arguments.of((Object)new int[][]{{1, 0}, {0, 2}}, 8),
                Arguments.of((Object)new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}, 14),
                Arguments.of((Object)new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}}, 21));
    }
}