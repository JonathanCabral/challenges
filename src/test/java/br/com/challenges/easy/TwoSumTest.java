package br.com.challenges.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    public void setUp() {
        this.twoSum = new TwoSum();
    }

    @Test
    public void teste1() {
        int nums[] = {2,7,11,15};
        int expected[] = {0,1};
        int[] result = twoSum.twoSum(nums, 9);
        assertArrayEquals(expected, result);
    }

    @Test
    public void teste2() {
        int nums[] = {3,2,4};
        int target = 6;
        int expected[] = {1,2};
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

}