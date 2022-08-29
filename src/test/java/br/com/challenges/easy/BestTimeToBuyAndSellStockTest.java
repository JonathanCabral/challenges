package br.com.challenges.easy;

import br.com.challenges.easy.arrays.BestTimeToBuyAndSellStock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    public void teste() {
        int[] prices = {7,1,5,3,6,4};
        BestTimeToBuyAndSellStock bttbs = new BestTimeToBuyAndSellStock();
        int result = bttbs.maxProfit(prices);
        assertEquals(5, result);
    }

    @Test
    public void teste1() {
        int[] prices = {7,6,4,3,1};
        BestTimeToBuyAndSellStock bttbs = new BestTimeToBuyAndSellStock();
        int result = bttbs.maxProfit(prices);
        assertEquals(0, result);
    }

    @Test
    public void teste2() {
        int[] prices = {2,4,1};
        BestTimeToBuyAndSellStock bttbs = new BestTimeToBuyAndSellStock();
        int result = bttbs.maxProfit(prices);
        assertEquals(2, result);
    }

}