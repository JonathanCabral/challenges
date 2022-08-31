package br.com.challenges.easy.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @Done
 * @leetcode 26. Remove Duplicates from Sorted Array
 * @Date August, 31th 22
 * @see " https://leetcode.com/problems/remove-duplicates-from-sorted-array/ "
 */
public class RemoveDuplicatesFromSortedArray {

    /**
     * @TimeComplexity O(n)
     * @SpaceComplexity O(1)
     */
    public int removeDuplicates(int[] nums) {
        int k = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                nums[k + 1] = nums[i];
                k++;
            }
        }

        return ++k;
    }
}
