package br.com.challenges.medium;

import java.util.List;

public class MinimumSwaps {

    /**
     * O(N2)
     * this solutions seems not to be the best. We need to pass through the list twice to find what what numbers need to
     * be swapped
     *
     * TODO for the future! Verify if it's possible to improve this algorithm
     */
    static int minimumSwaps(int[] arr) {
        int swap = 0;
        int aux = 1;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] == aux) {
                aux++;
                continue;
            }
            else {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j] == aux) {
                        Integer b = arr[i];
                        arr[i] = arr[j];
                        arr[j] =  b;
                        aux++;
                        swap++;
                        break;
                    }
                }
            }
        }
        return swap;
    }

}
