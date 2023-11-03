package TopicWisePreparation.B.SlidingWindow;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] price = {2, 7, 3, 5, 13, 1, 6, 8, 4};

        //minBuyPriceSofar = 1
        //maxProfitSofar = 0

        int minBuyPriceSofar = price[0]; //7
        int maxProfitsoFar = 0; //0

        for (int i = 0; i < price.length; i++) {
            minBuyPriceSofar = Math.min(minBuyPriceSofar, price[i]);
            maxProfitsoFar = Math.max(maxProfitsoFar, price[i] - minBuyPriceSofar);
        }
    }
}
