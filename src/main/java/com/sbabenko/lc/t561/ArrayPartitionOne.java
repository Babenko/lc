package com.sbabenko.lc.t561;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayPartitionOne {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1) {
            return nums[0];
        }
        List<List<Integer>> pairs = new ArrayList<>();

        for(int i = 0; i < nums.length - 1; i+=2) {
            List<Integer> pair = new ArrayList<>();
            pair.add(nums[i]);
            pair.add(nums[i + 1]);
            pairs.add(pair);
        }

        return pairs.stream()
                .map(pair -> pair.stream().min(Integer::compareTo))
                .map(Optional::get)
                .mapToInt(i -> i)
                .sum();
    }

}
