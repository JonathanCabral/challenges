package br.com.challenges.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    @Test
    public void teste1() {
        IsomorphicStrings is = new IsomorphicStrings();
        boolean result = is.isIsomorphic("egg", "add");
        assertTrue(result);
    }

}