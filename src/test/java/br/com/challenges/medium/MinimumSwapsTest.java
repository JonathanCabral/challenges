package br.com.challenges.medium;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSwapsTest {

    @Test
    public void test_case_1() {
        int result = MinimumSwaps.minimumSwaps(new int[]{4, 3, 1, 2});
        assertEquals(3, result);
    }

    @Test
    public void teste_case_2() {
        int result = MinimumSwaps.minimumSwaps(new int[]{2, 3, 4, 1, 5, 2});
        assertEquals(3, result);
    }

    @Test
    public void test_case_3() {
        int result = MinimumSwaps.minimumSwaps(new int[]{1, 3, 5, 2, 4, 6, 7});
        assertEquals(3, result);
    }

}