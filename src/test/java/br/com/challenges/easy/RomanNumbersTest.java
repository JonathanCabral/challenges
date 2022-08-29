package br.com.challenges.easy;

import br.com.challenges.easy.strings.RomanNumbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumbersTest {

    private RomanNumbers roman;

    @BeforeEach
    public void setUp() {
        this.roman = new RomanNumbers();
    }

    @Test
    public void numeral_um_para_int() {
        int value = roman.romanToInt("I");
        assertEquals(1, value);
    }

    @Test
    public void retornaValor2() {
        int value = roman.romanToInt("II");
        assertEquals(2, value);
    }

    @Test
    public void retornaValor3() {
        int value = roman.romanToInt("III");
        assertEquals(3, value);
    }


    @Test
    public void retornaValor5() {
        int value = roman.romanToInt("V");
        assertEquals(5, value);
    }

    @Test
    public void retornaValor8() {
        int value = roman.romanToInt("VIII");
        assertEquals(8, value);
    }

    @Test
    public void retornaValor50() {
        int value = roman.romanToInt("L");
        assertEquals(50, value);
    }

    @Test
    public void retornaValor53() {
        int value = roman.romanToInt("LIII");
        assertEquals(53, value);
    }

    @Test
    public void retornaValor55() {
        int value = roman.romanToInt("LV");
        assertEquals(55, value);
    }

    @Test
    public void retornaValor100() {
        int value = roman.romanToInt("C");
        assertEquals(100, value);
    }

    @Test
    public void retornaValor500() {
        int value = roman.romanToInt("D");
        assertEquals(500, value);
    }

    @Test
    public void retornaValor1000() {
        int value = roman.romanToInt("M");
        assertEquals(1000, value);
    }

    // CORNER CASES

    @Test
    public void retornaValor4() {
        int value = roman.romanToInt("IV");
        assertEquals(4, value);
    }

    @Test
    public void retornaValor9() {
        int value = roman.romanToInt("IX");
        assertEquals(9, value);
    }
}