package br.com.challenges.medium.arrays;

import java.util.List;

/**
 * @since August 12th, 2021
 * @Author Jonathan Cabral
 */
public class NewYearChaos {

    public static void minimumBribes(List<Integer> q) {
        int aux = 0;
        for (int i = q.size(); i >= 0 ; i--) {
            if(q.get(i) - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++){
                if (q.get(j) > q.get(i))
                    aux++;
            }
        }
        System.out.println(aux);
    }
}
