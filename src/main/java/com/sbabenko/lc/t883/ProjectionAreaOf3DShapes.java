package com.sbabenko.lc.t883;

public class ProjectionAreaOf3DShapes {

    public int projectionArea(int[][] grid) {

        int result = 0;
        int max = 0;

        for(int x = 0; x < grid.length; x++) {

            for (int y = 0; y < grid[x].length; y++) {

                if (grid[x][y] > 0) {
                    result++;
                }

                if (max < grid[x][y]) {
                    max = grid[x][y];
                }

            }
            System.out.println(max);
            result += max;
            max = 0;
        }

        return result;
    }
}
