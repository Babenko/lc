package com.sbabenko.lc.t867;

public class TransposeMatrix {

    public int[][] transpose(int[][] matrix) {
        int[][] transportMatrix = new int[matrix[0].length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                transportMatrix[column][row] = matrix[row][column];
            }
        }
        return transportMatrix;
    }
}
