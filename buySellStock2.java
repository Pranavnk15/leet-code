// Best Time to Buy and Sell Stock II



// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

// Find and return the maximum profit you can achieve.

 





class buySellSock2 {
    public int maxProfit(int[] prices) {
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++) {
           
                if(buyingPrice < prices[i]) {
                    maxProfit += prices[i] - buyingPrice;
                     buyingPrice = prices[i];
                     
                } else {
                    buyingPrice = prices[i];
                }
            
        }
        return maxProfit;
    }
}