package br.com.challenges.easy.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    private final LongestCommonPrefix lcp = new LongestCommonPrefix();

    @Test
    public void teste() {
        var result = lcp.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        assertEquals("fl", result);
    }

    @Test
    public void teste2() {
        var result = lcp.longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        assertEquals("", result);
    }
}