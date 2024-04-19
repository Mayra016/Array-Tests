class MostProfitable {
    public int maxProfit(int[] prices) {
        // initialize the variables with the maximal and minimum values
        int buy = Integer.MAX_VALUE;
        int sell = Integer.MIN_VALUE;
        // 0, because if there is no profit, it must return 0. Even if the result is negative, because the seller don't want to lose money. He will wait for a better opportunity.
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy || i == 0) {
                buy = prices[i];
                sell = Integer.MIN_VALUE; // reset sell value if there is a better buy's option
            } else if (prices[i] > sell && i > 0) {
                sell = prices[i];
                maxProfit = Math.max(maxProfit, sell - buy); // return the greater value of the two given parameters.
            }
        }

        return maxProfit;
    }    
}
