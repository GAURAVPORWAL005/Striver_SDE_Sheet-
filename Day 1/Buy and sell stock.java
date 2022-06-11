
// Brute force Approach
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j] - prices[i] > max){
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }
}
// Time complexity => O(n^2)

// Optimized Approach
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int profit = 0;
        int current = prices[0];
        for(int i=1;i<prices.length;i++){
            if(current > prices[i]){
                current = prices[i];
            }
            else{
                profit = prices[i] - current;
                max = Math.max(profit, max);
            }
        }
        return max;
    }
}

// Time complexity => O(n)
