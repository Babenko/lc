package com.sbabenko.lc.t883;

import java.util.ArrayList;
import java.util.List;

public class ProjectionAreaOf3DShapes {

    public int projectionArea(int[][] grid) {

        int[][] arr = new int[2][];
        arr[0] = new int[5];
        arr[1] = new int[15];
        

        int result = 0;
        List<Tuple<Integer, Integer, Integer>> points = new ArrayList<>();
        for(int x = 0; x < grid.length; x++) {

            for (int y = 0; y < grid[x].length; y++) {

                points.add(Tuple.of(x, y, grid[x][y]));
                if (grid[x][y] > 0) {
                    result++;
                }
            }
        }

        for (int i = 0; i < points.size(); i++) {
            Integer currentVal = i;
            int maxX = points.stream().filter(tuple -> tuple.getX().equals(currentVal)).mapToInt(Tuple::getHeight).max().orElse(0);
            int maxY = points.stream().filter(tuple -> tuple.getY().equals(currentVal)).mapToInt(Tuple::getHeight).max().orElse(0);
            result +=maxX;
            result +=maxY;
        }

        return result;
    }

    private static class Tuple<P1, P2, V> {

        P1 x;
        P2 y;
        V height;

        private Tuple(P1 x, P2 y, V height) {
            this.x = x;
            this.y = y;
            this.height = height;
        }

        public static <P1, P2, V> Tuple of(P1 x, P2 y, V height) {
            return new Tuple<>(x, y, height);
        }

        public P1 getX() {
            return x;
        }

        public P2 getY() {
            return y;
        }

        public V getHeight() {
            return height;
        }

    }
}
