<<<<<<< HEAD
//Best Time to Buy and Sell Stock


class buySellStock {
    public int maxProfit(int[] prices) {
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++) {
            if(buyingPrice < prices[i]) {
                int profit = prices[i] - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyingPrice = prices[i];
            }
        }
        return maxProfit;
    }
=======
//Best Time to Buy and Sell Stock


class buySellStock {
    public int maxProfit(int[] prices) {
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++) {
            if(buyingPrice < prices[i]) {
                int profit = prices[i] - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyingPrice = prices[i];
            }
        }
        return maxProfit;
    }
>>>>>>> 653ad8c (second cmmit)
}