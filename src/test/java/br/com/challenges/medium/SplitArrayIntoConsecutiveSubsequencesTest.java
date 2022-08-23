package br.com.challenges.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitArrayIntoConsecutiveSubsequencesTest {

    private SplitArrayIntoConsecutiveSubsequences split;

    @BeforeEach
    public void setUp() {
        this.split = new SplitArrayIntoConsecutiveSubsequences();
    }

    @Test
    public void teste1() {
        int[] nums = {1,2,3,3,4,5};
        assertTrue(split.isPossible(nums));
    }

    @Test
    public void teste2() {
        int[] nums = {1,2,3,3,4,4,5,5};
        assertTrue(split.isPossible(nums));
    }

    @Test
    public void teste3() {
        int[] nums = {1,2,3,4,4,5};
        assertFalse(split.isPossible(nums));
    }

}