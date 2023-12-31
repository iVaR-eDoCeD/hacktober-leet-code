

class Best_time_to_buy_sell_stocks_during_cooldown {
    
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][]=new int[n+2][2];
    
        for(int ind = n-1; ind>=0; ind--){
            for(int buy=0; buy<=1; buy++){
                int profit=0;
            
                if(buy==0){// We can buy the stock
                    profit = Math.max(0+dp[ind+1][0], -prices[ind] + dp[ind+1][1]);
                }
    
                if(buy==1){// We can sell the stock
                    profit = Math.max(0+dp[ind+1][1], prices[ind] + dp[ind+2][0]);
                }
            
                dp[ind][buy] = profit;
            }
        }
    
        return dp[0][0];

    }

}
