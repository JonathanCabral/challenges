package br.com.challenges.easy;

import easy.SimpleArraySum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SimpleArraySumTest {

    private SimpleArraySum simpleArraySum;

    @BeforeEach
    public void setUp() {
        this.simpleArraySum = new SimpleArraySum();
    }

    @Test
    public void sample_test_case_one() {
        List<Integer> values = Arrays.asList(1, 2, 3, 4);
        Integer result = this.simpleArraySum.simpleArraySum(values);
        Assertions.assertEquals(result, 10);
    }

}
