package br.com.challenges.easy;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayLeftRotationTest {

    @Test
    public void rotate_4_time() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = ArrayLeftRotation.rotLeft(arr, 4);
        assertEquals(Arrays.asList(5, 1, 2, 3, 4), result);
    }

    @Test
    public void rotate_10_time() {
        List<Integer> expected = Arrays.asList(77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77);
        List<Integer> arr = Arrays.asList(41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51);
        List<Integer> result = ArrayLeftRotation.rotLeft(arr, 10);
        assertEquals(expected, result);
    }

    @Test
    public void rotate_13_time() {
        List<Integer> expected = Arrays.asList(87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60);
        List<Integer> arr = Arrays.asList(33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97);
        List<Integer> result = ArrayLeftRotation.rotLeft(arr, 13);
        assertEquals(expected, result);
    }

    // *********** FASTERS WAY TO SOLVE ******************//

    @Test
    public void rotate_4_time_2() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = ArrayLeftRotation.rotLeft2(arr, 4);
        assertEquals(Arrays.asList(5, 1, 2, 3, 4), result);
    }

    @Test
    public void rotate_10_time_2() {
        List<Integer> expected = Arrays.asList(77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77);
        List<Integer> arr = Arrays.asList(41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51);
        List<Integer> result = ArrayLeftRotation.rotLeft2(arr, 10);
        assertEquals(expected, result);
    }

    @Test
    public void rotate_13_time_2() {
        List<Integer> expected = Arrays.asList(87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60);
        List<Integer> arr = Arrays.asList(33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97);
        List<Integer> result = ArrayLeftRotation.rotLeft2(arr, 13);
        assertEquals(expected, result);
    }
}