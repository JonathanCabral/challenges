package br.com.challenges.easy.arrays;

import java.util.HashMap;

/**
 * @leetcode https://leetcode.com/problems/two-sum/submissions/
 * @author jonathan
 * @Date August, 18th 2022
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> auxs = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            Integer expected = target - nums[i];
            if(auxs.containsKey(expected) && auxs.get(expected) != i)
                return new int[]{auxs.get(expected), i};
            else auxs.put(nums[i], i);
        }

        return new int[0];
    }
}
