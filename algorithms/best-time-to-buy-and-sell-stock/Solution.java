public class Solution {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(maxProfit(new int[]{2, 4, 1}));
        System.out.println(maxProfit(new int[]{}));
        System.out.println(maxProfit(new int[]{1, 2}));
        System.out.println(maxProfit(new int[]{3, 3, 3}));
    }

    public static int maxProfit(int[] transactions) {
        int maxProfit = 0;
        if (transactions.length == 0)
            return maxProfit;
        for (int i = 0; i < transactions.length-1; i++) {
            for (int j = i+1; j < transactions.length; j++) {
                int profit = transactions[j] - transactions[i];
                if (profit > 0 && maxProfit < profit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}