class BestTimeToBuyAndSellStocks {
    public int maxProfit(int[] prices) {
        int finalAns = 0;
        int min = prices[0];
        int max = prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
                max = min;
            }
            else if(prices[i]>max){
                max = prices[i];
                finalAns = Math.max(finalAns, max - min);
            }
        }
        return finalAns;
    }
}