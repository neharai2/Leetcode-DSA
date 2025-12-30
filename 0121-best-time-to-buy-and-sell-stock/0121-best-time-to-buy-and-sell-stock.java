class Solution {
    public int maxProfit(int[] prices) {

      int buy = prices[0];
      int curr = 0;
      int max_profit = 0;

      for(int i = 0; i< prices.length; i++){
        if(buy > prices[i]){
            buy = prices[i];
        }
        else{
            curr = prices[i] - buy;
            max_profit = Math.max(max_profit, curr);
        }
      }
      return max_profit;
        
    }
}