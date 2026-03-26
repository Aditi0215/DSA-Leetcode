class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyPrice){
                buyPrice = prices[i];
            }
            profit = Math.max(profit,(prices[i]-buyPrice));
        }
        //Returning profit
         return profit;
    }
}