package br.com.challenges.medium.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @leetcode 3. Longest Substring Without Repeating Characters
 * @Date August, 28th 22
 * @see "https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * @Done || @Failed || @Stopped
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>  aux = new HashSet<>();

        int apointer = 0;
        int bpointer = 0;
        int max = 0;

        while(bpointer < s.length()) {
            if(!aux.contains(s.charAt(bpointer))) {
                aux.add(s.charAt(bpointer));
                bpointer++;
                max = Math.max(aux.size(), max);
            } else {
                aux.remove(s.charAt(apointer));
                apointer++;
            }
        }

        return max;
    }

}
