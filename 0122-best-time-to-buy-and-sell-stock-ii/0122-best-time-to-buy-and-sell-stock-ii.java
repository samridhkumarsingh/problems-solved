class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int profit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(buyprice<prices[i])
            {
                profit+=prices[i]-buyprice;
                maxp=Math.max(profit,maxp);
                buyprice=prices[i];
            }
            else
            {
                buyprice=prices[i];
            }
        }
        return maxp;
    }
}