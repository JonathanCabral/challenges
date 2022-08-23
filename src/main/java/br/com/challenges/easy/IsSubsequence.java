package br.com.challenges.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @hackerrank https://leetcode.com/problems/running-sum-of-1d-array/submissions/
 * @author jonathan
 * @Date August, 21th 2021
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int positionLastCharFound = 0;
        if(s.length() > t.length()) return false;
        for(int i = 0; i < s.length(); i++) {
            //Se o char não existir no na String T, return false;
           if(! t.contains(String.valueOf(s.charAt(i)))) return false;
           if(positionLastCharFound == t.length()) return false;
           //itera sobre a String t para procurar se existem os outro chars.
            for (int j = positionLastCharFound; j < t.length(); j++) {
                //quer dizer que o char existe
                if(s.charAt(i) == t.charAt(j)) {
                    //positionLastCharFound começa na proxima letra
                    positionLastCharFound = j+1;
                    break;
                } else if(j == t.length()-1) return false;
            }
        }
        return true;
    }
}
