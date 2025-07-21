package com.example.data_structure.michael_session;

import java.util.Arrays;

//maximum profit by share buy sell--leetcode-121
public class Demo5
{
    public static int getMaxProfit(int[] prices){
//        if(prices.length==1)
//            return 0;
//        int buy = prices[0];
//
//        int[] profits = new int[prices.length];
//        profits[0] = 0;
//        for(int i=1;i<prices.length;i++){
//            buy = Math.min(buy,prices[i]);
//            int profit = prices[i] - buy;
//            profits[i] = Math.max(profit,profits[i-1]);
//        }
//        return profits[prices.length-1];

        //optimised approach
        int minPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for (int price:prices){
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println("Maximum profit: "+getMaxProfit(prices));;
    }
}
