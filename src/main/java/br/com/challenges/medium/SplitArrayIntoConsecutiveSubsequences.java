package br.com.challenges.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SplitArrayIntoConsecutiveSubsequences {

    public boolean isPossible(int[] nums) {
        HashMap<Integer, List<Integer>>  auxs = new HashMap<>();

        int u = 1;
        auxs.put(1, Collections.EMPTY_LIST);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] - nums[i-1] == 1 && !auxs.get(u).contains(nums[i])) {
                auxs.get(u).add(nums[i]);
            }
        }

        return true;
    }
}