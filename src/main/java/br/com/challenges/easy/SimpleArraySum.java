package br.com.challenges.easy;

import java.util.List;

/**
 * given an array of integer, sum all of them and return it value.
 * eg: ar = [1,2,3,4] = 10, return 10
 */
public class SimpleArraySum {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */
    public Integer simpleArraySum(List<Integer> values) {
        Integer aux = 0;
        for (Integer v : values) {
            aux += v;
        }
        return aux;
    }
}
