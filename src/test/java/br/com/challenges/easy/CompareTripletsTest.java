package br.com.challenges.easy;

import br.com.challenges.easy.lists.CompareTriplets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CompareTripletsTest {

    private CompareTriplets compareTriplets;

    @BeforeEach
    public void setUp() {
        this.compareTriplets = new CompareTriplets();
    }

    @Test
    public void sample_test_case_one() {
        List<Integer> as = Arrays.asList(1, 4, 6);
        List<Integer> bs = Arrays.asList(4, 1, 6);
        List<Integer> results = compareTriplets.compare(as, bs);
        Assertions.assertEquals(results.get(0), 1);
        Assertions.assertEquals(results.get(1), 1);
    }


}
