package br.com.challenges.easy.arrays;

import java.util.List;

/**
 * given an 6x6 2D array
 * An hourglass in A is a subset of values with indices falling in this pattern in 's graphical representation:
 */
public class TwoDArrays {

    public static int hourglassSum(List<List<Integer>> arr) {
        Integer sum = Integer.MIN_VALUE;
        for(int linha = 0; linha < 4; linha++) { //row
            for(int coluna = 0; coluna < 4; coluna++)//col
                 sum = Math.max(getSum(arr, linha, coluna), sum);
        }
        return sum;
    }

    private static int getSum(List<List<Integer>> arr, int linha, int coluna) {
        return arr.get(linha).get(coluna) + arr.get(linha).get(coluna+1) + arr.get(linha).get(coluna+2) +
                arr.get(linha+1).get(coluna+1) +
                arr.get(linha+2).get(coluna) + arr.get(linha+2).get(coluna+1) + arr.get(linha+2).get(coluna+2);
    }

}
