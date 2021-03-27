package com.lichunjie.leetcode.array.question02;

public class Solution {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int length = prices.length;
        if (length <= 1) return 0;
        for (int i = 1; i < length ; i++) {
            int sub = prices[i] - prices[i - 1];
            if (sub > 0) {
                profit += sub;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
//        int[] arr = {7, 1, 5, 3, 6, 4};
//        int[] arr = {1,2,3,4,5};
        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
}