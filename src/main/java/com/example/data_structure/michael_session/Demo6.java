package com.example.data_structure.michael_session;

//maximum profit by share buy sell--leetcode-122
public class Demo6
{
    public static int getMaxProfit(int[] prices){
        int maxProfit = 0;
        int n = prices.length;
        for (int i = 0; i < n - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                maxProfit += prices[i + 1] - prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit: "+getMaxProfit(prices));;
    }
}
