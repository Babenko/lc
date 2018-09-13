package com.sbabenko.lc.t852;

public class PeakIndexInMountainArray {

    public int peakIndexInMountainArray(int[] array) {
        int result = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i -1] < array[i] && array[i] > array[i + 1]) {
                result = i;
            }
        }
        return result;
    }
}
