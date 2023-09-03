public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            
            int potentialProfit = price - minPrice;
            
   
            maxProfit = Math.max(maxProfit, potentialProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Solution solution = new Solution();
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
