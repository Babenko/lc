package com.sbabenko.lc.t832;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.fail;

class FlippingAnImageTest {


    @ParameterizedTest
    @MethodSource("rawImages")
    void flipAndInvertImage(Object rawImage, Object expectedImage) {
        int[][] image = (int[][]) rawImage;
        int[][] expected = (int[][]) expectedImage;
        var flippingImage = new FlippingAnImage();

        var result = flippingImage.flipAndInvertImage(image);

        for(int i = 0; i < result.length; i++) {
            for (int y = 0; y < result[i].length; y++) {
                if (expected[i][y] != result[i][y]) {
                    fail("Element equality is fail");
                }
            }
        }

    }

    private static Stream<Arguments> rawImages() {
        return Stream.of(
                Arguments.of((Object)new int[][]{{1,1,0},{1,0,1},{0,0,0}}, (Object)new int[][]{{1,0,0},{0,1,0},{1,1,1}}),
                Arguments.of((Object)new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}}, (Object)new int[][]{{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}}));
    }


}