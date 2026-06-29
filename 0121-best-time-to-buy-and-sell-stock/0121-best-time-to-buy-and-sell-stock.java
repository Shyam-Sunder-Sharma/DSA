class Solution {
    public int maxProfit(int[] prices) {

        if (prices.length == 1) {
            return 0;
        }

        int b = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < b) {
                b = prices[i];
            } else {
                int tp = prices[i] - b;
                if (tp > profit) {
                    profit = tp;
                }
            }
        }
        return profit;
    }
}