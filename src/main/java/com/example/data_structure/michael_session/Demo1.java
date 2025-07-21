package com.example.data_structure.michael_session;

//robber-house problem
public class Demo1 {

    public static int getMaximumRobAmount(int[] nums) {
        int[] ds = new int[nums.length];
        ds[0] = nums[0];
        ds[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            ds[i] = Math.max(ds[i - 2] + nums[i], ds[i - 1]);
        }
        return ds[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] myNumbers = {2, 7, 3, 1, 4, 2, 1, 8};
        int maximumRobAmount = getMaximumRobAmount(myNumbers);
        System.out.println(maximumRobAmount);
    }
}

