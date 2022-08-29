package br.com.challenges.easy.arrays;

/**
 * @leetcode 121. Best Time to Buy and Sell Stock
 * @see "https://leetcode.com/problems/best-time-to-buy-and-sell-stock/"
 * @Date August, 25th 22
 */
//TODO voltar e tentar resolver com uma solução melhor.
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            profit = prices[i] - buy;
            if(maxprofit < profit){
                maxprofit = profit;
            }
        }
        return maxprofit;
    }
}
