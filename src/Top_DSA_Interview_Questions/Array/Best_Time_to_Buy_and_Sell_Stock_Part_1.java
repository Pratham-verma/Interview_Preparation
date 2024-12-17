package Top_DSA_Interview_Questions.Array;

//   You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//   You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//   Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//
//
//   Example 1:
//
//   Input: prices = [7,1,5,3,6,4]
//   Output: 5
//   Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//   Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//
//   Example 2:
//
//   Input: prices = [7,6,4,3,1]
//   Output: 0
//   Explanation: In this case, no transactions are done and the max profit = 0.

public class Best_Time_to_Buy_and_Sell_Stock_Part_1 {
    public static void maxProfit(int[] prices) {
        // prices = [7,1,5,3,6,4] --> prices[0] is the price of the stock.
        // days start form the price[1]
        int n = prices.length;
        int buy = prices[0];
        int profit = 0;

        for (int i = 0; i < n; i++){
            if (prices[i] < buy){
                buy = prices[i];
            }
            else if (prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
        }
        System.out.print( "Answer is " + ": " + profit);
    }
    public static void main(String[] args){
        int[] nums = {7,1,5,3,6,4};
        maxProfit(nums);
    }
}
