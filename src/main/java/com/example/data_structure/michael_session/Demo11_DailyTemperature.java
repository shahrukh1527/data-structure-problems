package com.example.data_structure.michael_session;

import java.util.Stack;

public class Demo11_DailyTemperature {
    public static int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();

        int[] results = new int[temp.length];

        for (int i=temp.length-1;i>=0;i--){
            while(!stack.isEmpty() && temp[i]>= temp[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                results[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return results;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{73,74,75,71,69,72,76,73};
        for (int i: dailyTemperatures(nums)){
            System.out.print(i+" ");
        }
    }
}
