package com.sbabenko.lc.t905;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] array) {

        int[] even = new int[array.length];
        int[] odd = new int[array.length];
        int oddIndex = 0;
        int evenIndex = 0;

        for(int i : array) {

            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }

        }

        System.arraycopy(even, 0, array,0, evenIndex);
        System.arraycopy(odd, 0, array, evenIndex, oddIndex);

        return array;
    }

}
