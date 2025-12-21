package com.example.data_structure.referrence_area;

public class Demo22_LadderProblem {
    public static int getNUmberOfways(int n){
        if(n==1){
            return 1;
        }
        int[] dp = new int[n];

        dp[0]=1;
        dp[1] = 2;

        for(int i= 3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        System.out.println(getNUmberOfways(8));
    }
}
