package br.com.challenges.easy;

import java.util.Arrays;
import java.util.List;

/**
 * @hackerrank
 */
public class CompareTriplets {
    public List<Integer> compare(List<Integer> as, List<Integer> bs) {
        Integer a = 0;
        Integer b = 0;

        for (int i = as.size() - 1; i >= 0; i--) {
            if(as.get(i) > bs.get(i))
                a++;
            else if(as.get(i) < bs.get(i))
                b++;
        }
        return Arrays.asList(a, b);
    }
}
