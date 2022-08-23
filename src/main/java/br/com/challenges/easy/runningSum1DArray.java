package br.com.challenges.easy;

/**
 * @hackerrank https://leetcode.com/problems/running-sum-of-1d-array/submissions/
 * @author jonathan
 * @Date August, 21th 2021
 */
public class runningSum1DArray {
    public int[] runningSum(int[] nums) {
        int aux = nums[0];
        for(int p = 1; p <=  nums.length-1; p++) {
            nums[p] = nums[p] + aux;
            aux = nums[p];
        }
        return nums;
    }
}
