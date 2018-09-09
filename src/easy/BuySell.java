package easy;

public class BuySell {

    public static int maxProfit(int[] prices) {
        int profit=0;
        int i=0;
        while(i < prices.length) {
            //find local minima
            while ((i < prices.length -1) && prices[i] >= prices[i+1]) {
                i++;
            }
            int min = prices[i++];
            //find local maxima
            while ((i < prices.length -1) && prices[i] <= prices[i+1]) {
                i++;
            }
            profit += (i< prices.length)? (prices[i++] - min):0;
            
            
        }// while
        return profit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

}
