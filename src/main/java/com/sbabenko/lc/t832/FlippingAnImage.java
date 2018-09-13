package com.sbabenko.lc.t832;

public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image[0].length];

        for (int i = 0; i < image.length; i++) {
            for (int r = image[i].length - 1, y = 0; r >= 0; r--, y++) {
                result[i][y] = image[i][r] ^ 1;
            }

        }

        return result;
    }
}
