package br.com.challenges.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @hackerrank bit.ly/3jNejXJ (Arrays: Left Rotation)
 * @author jonathan
 * @Date August, 10th 2021
 */
public class ArrayLeftRotation {


    //this code do not respect time limite
    public static List<Integer> rotLeft(List<Integer> arr, int rotations) {
        for(int i = 1; i <= rotations ; i++) {
            int first = arr.get(0);
            for(int a = 1; a <= arr.size()-1; a++) {
                arr.set(a-1, arr.get(a));
            }
            arr.set(arr.size()-1, first);
        }

        return arr;
    }

    //this solution use modular arithmetics to solve the time problem
    public static List<Integer> rotLeft2(List<Integer> arr, int rotations) {
        ArrayList<Integer> result = new ArrayList<>(arr);
        int aux = 0;
        for(int i = 0; i < arr.size(); i++){
            int newLocation = (i + (arr.size() - rotations)) % arr.size();
            result.set(newLocation, arr.get(i));
        }
        return result;
    }

}
