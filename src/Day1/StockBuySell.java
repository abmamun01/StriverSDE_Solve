package Day1;

public class StockBuySell {

    static int maxProfitFunc(int[] prices) {

        /**
         * Basically amra min price ber korte thakbo loop r maddome
         * and conditon r maddome check dibo j next kono small value
         * ache kina buy korar jonno jodi na thake tahole minPrice atai
         * thakbe r else if condition ye sell korbo current price r sathe
         * min price minus - kore
         *
         */
        // minimum price lagbe stock buy korar jonno
        // karon min price kinte parle max profit pabo
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) minPrice = prices[i];
            else if (prices[i] - minPrice > maxProfit)
                maxProfit = prices[i] - minPrice;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfitFunc(arr));
    }
}
