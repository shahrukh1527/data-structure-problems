package com.example.data_structure;

//climb stair
public class Demo2 {

    public static int climbStairs(int n) {
        if(n==1 || n==0){
            return 1;
        }
        // int[] cs = new int[n];
        // cs[0]=1;
        // cs[1]=2;

        // for(int i=2;i<n;i++){
        //     cs[i] = cs[i-1]+cs[i-2];
        // }

        // return cs[n-1];

        int prev=1;
        int curr=2;

        for(int i=3;i<=n;i++){
            int next = prev+curr;
            prev=curr;
            curr=next;
        }

        return curr;

    }
    public static void main(String[] args) {
        int result = climbStairs(3);
        System.out.println(result);
    }
}
