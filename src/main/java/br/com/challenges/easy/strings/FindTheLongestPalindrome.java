package br.com.challenges.easy.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @leetcode 409. Longest Palindrome
 * @Date August, 25th 22
 * @see "https://leetcode.com/problems/longest-palindrome/"
 */
public class FindTheLongestPalindrome {
    /**
     * @TimeComplexity = O(n) first loop O(n) + second loop O(n) == O(2+N) remove the constats.
     * @MemoryComplexity = O(n) 1 memory space for each letter in the string.
     */
    public int longestPalindrome(String s) {
        //key = each letter from string value = number of times that the letter occurs on the string S
        Map<Character, Integer> counts = new HashMap<>();
        int result = 0;

        //iterate over the string to count how many time each letter occours
        for(char letter: s.toCharArray() ) {  //O(n)
            if(counts.containsKey(letter))
                counts.put(letter, counts.get(letter)+1); //O(1)
            else counts.put(letter, 1);//O(1)
        }

        for (Map.Entry<Character, Integer> c : counts.entrySet()) { //O(M)
            //divide the times by 2 times 2. 3 / 1 == 1 * 2 == 2
            //we do this to consider the letters that can have odds numbers of occurrence
            result += c.getValue() / 2 * 2; //O(1)
            //if our longest palindrome is even and our letter is odd. we cand add the middle letter in the palindrome,
            if(result %2 == 0 && c.getValue()%2 ==1)
                result++; //O(1)
        }

        return result;
    }
}