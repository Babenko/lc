package com.sbabenko.lc.t1342;

public class NumberOfStepsToReduceANumberToZero {

    public int numberOfSteps (int num) {
        int temp = num;
        int result = 0;
        while (temp > 0) {
            if (temp % 2 == 0) {
                temp /= 2;
            } else {
                temp--;
            }
            result++;
        }
        return result;
    }
}
