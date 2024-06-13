// Time Complexity: O(n^2)
// Space Complexity : O(1)

class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxProfit = 0;
        int firstDay = 0;
        int lastDay = prices.length -1;
        
        for ( int i = firstDay; i<= lastDay; i++ )
        {
            int buy = prices[i];
            // System.out.println("Buy" + buy);
            if ( buy == 0 && i != firstDay && prices[i - 1] != 0 )
            {
                // System.out.println("first 0" + buy);
                for ( int j = i + 1; j <= lastDay; j++ )
                {
                int sell = prices[j];
                if( prices[i] > prices[j] )
                {
                    // System.out.println("Price Buy: " + prices[i] +" greater than Price Sell: "+prices[j]);
                    // System.out.println("exiting");
                    break;
                } 
                int profit = sell - buy;
                if ( maxProfit < profit )
                {
                    maxProfit = profit;
                    // System.out.println("Max Profit: " + maxProfit);
                }
            }
            }
            else if ( buy == 0 && i != firstDay && prices[i - 1] == 0 )
            {
                
            }
            else
            {
                for ( int j = i + 1; j <= lastDay; j++ )
                {
                int sell = prices[j];
                if( prices[i] > prices[j] )
                {
                    // System.out.println("Price Buy: " + prices[i] +" greater than Price Sell: "+prices[j]);
                    // System.out.println("exiting");
                    break;
                } 
                int profit = sell - buy;
                if ( maxProfit < profit )
                {
                    maxProfit = profit;
                    // System.out.println("Max Profit: " + maxProfit);
                }
                }
            }
            
        }

        return maxProfit;
        
    }
}
