package br.com.challenges.easy;

import br.com.challenges.easy.arrays.TwoDArrays;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDArraysTest {

    @Test
    public void test_case_1() {
        List<Integer> arr1 = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> arr2 = Arrays.asList(0, 1, 0, 0, 0, 0);
        List<Integer> arr3 = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> arr4 = Arrays.asList(0, 0, 2, 4, 4, 0);
        List<Integer> arr5 = Arrays.asList(0, 0, 0, 2, 0, 0);
        List<Integer> arr6 = Arrays.asList(0, 0, 1, 2, 4, 0);
        List<List<Integer>> arr = Arrays.asList(arr1, arr2, arr3, arr4, arr5, arr6);

        int result = TwoDArrays.hourglassSum(arr);
        assertEquals(19, result);
    }

    @Test
    public void test_case_2() {
        List<Integer> arr1 = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> arr2 = Arrays.asList(0, 1, 0, 0, 0, 0);
        List<Integer> arr3 = Arrays.asList(1, 1, 1, 0, 0, 0);
        List<Integer> arr4 = Arrays.asList(0, 9, 2, -4, -4, 0);
        List<Integer> arr5 = Arrays.asList(0, 0, 0, -2, 0, 0);
        List<Integer> arr6 = Arrays.asList(0, 0, -1, -2, -4, 0);
        List<List<Integer>> arr = Arrays.asList(arr1, arr2, arr3, arr4, arr5, arr6);

        int result = TwoDArrays.hourglassSum(arr);
        assertEquals(13, result);
    }

    public void test_case_3() {
        List<Integer> arr1 = Arrays.asList(-9, -9, -9, 1, 1, 1);
        List<Integer> arr2 = Arrays.asList(0, -9, 0, 4, 3, 2);
        List<Integer> arr3 = Arrays.asList(-9, -9, -9, 1, 2, 3);
        List<Integer> arr4 = Arrays.asList(0, 0, 8, 6, 6, 0);
        List<Integer> arr5 = Arrays.asList(0, 0, 0, -2, 0, 0);
        List<Integer> arr6 = Arrays.asList(0, 0, 1, 2, 4, 0);
        List<List<Integer>> arr = Arrays.asList(arr1, arr2, arr3, arr4, arr5, arr6);

        int result = TwoDArrays.hourglassSum(arr);
        assertEquals(28, result);
    }

}