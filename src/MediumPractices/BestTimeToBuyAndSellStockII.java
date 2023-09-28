package MediumPractices;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {

        int eventualProfit = 0;
        int maxProfit = 0;

        for (int i = 0, j = 1; j < prices.length; j++){
            if (prices[i] < prices[j]){
                if (eventualProfit < prices[j] - prices[i]){
                    eventualProfit = prices[j] - prices[i];
                }else{
                    i = j;
                    maxProfit = maxProfit + eventualProfit;
                    eventualProfit = 0;
                }
            }else {
                if(eventualProfit == 0){
                    i++;
                }else {
                    i = j;
                    maxProfit = maxProfit + eventualProfit;
                    eventualProfit = 0;

                }
            }
        }
        if (eventualProfit != 0){
            return eventualProfit + maxProfit;
        }else {
            return maxProfit;
        }
    }
}
