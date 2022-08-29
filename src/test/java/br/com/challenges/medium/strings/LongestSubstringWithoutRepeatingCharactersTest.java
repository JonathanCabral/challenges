package br.com.challenges.medium.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters ls = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void teste1() {
        int result = ls.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, result);
    }

    @Test
    public void teste2() {
        int result = ls.lengthOfLongestSubstring("bbbbb");
        assertEquals(1, result);
    }

    @Test
    public void teste3() {
        int result = ls.lengthOfLongestSubstring("abccabcbb");
        assertEquals(3, result);
    }

    @Test
    public void teste4() {
        int result = ls.lengthOfLongestSubstring("aab");
        assertEquals(2, result);
    }

    @Test
    public void teste5() {
        int result = ls.lengthOfLongestSubstring("dvdf");
        assertEquals(3, result);
    }
}