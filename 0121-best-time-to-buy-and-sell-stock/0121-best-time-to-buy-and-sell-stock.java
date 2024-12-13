class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=Integer.MIN_VALUE;

        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<buy)
            {
                buy=prices[i];
            }
            else
            {
                int diff= prices[i]-buy;
                profit=Math.max(profit,diff);
            }
        }
        if(profit<-1)
        {
            return 0;
        }
        return profit;
        
    }
}