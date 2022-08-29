package br.com.challenges.easy;

import br.com.challenges.easy.strings.FindTheLongestPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FindTheLongestPalindromeTest {

    @Test
    public void teste() {
        int result = new FindTheLongestPalindrome().longestPalindrome("abccccdd");
        assertEquals(7, result);
    }

    @Test
    public void teste1() {
        int result = new FindTheLongestPalindrome().longestPalindrome("a");
        assertEquals(1, result);
    }

    @Test
    public void teste2() {
        int result = new FindTheLongestPalindrome().longestPalindrome("bananas");
        assertEquals(5, result);
    }

    @Test
    public void teste4() {
        int result = new FindTheLongestPalindrome().longestPalindrome("ccc");
        assertEquals(3, result);
    }

    @Test
    public void teste5() {
        int result = new FindTheLongestPalindrome().longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth");
        assertEquals(983, result);
    }

    @Test
    public void teste6() {
        int result = new FindTheLongestPalindrome().longestPalindrome("ababababa");
        assertEquals(9, result);
    }
}