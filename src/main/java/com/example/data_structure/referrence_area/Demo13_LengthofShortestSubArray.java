package com.example.data_structure.referrence_area;

public class Demo13_LengthofShortestSubArray {

    public static int lengthOfshortestSubArrayWithSumEqualtoTarget(int[] nums , int target){

        int start =0;
        int minLength = Integer.MAX_VALUE;
        int current_sum=0;

        for(int end=0; end<nums.length;end++){
            current_sum = current_sum+ nums[end];

            while(current_sum>target){
                current_sum = current_sum - nums[start];
                start++;
            }

            if(current_sum == target){
                minLength = Math.min(minLength,end-start+1);
            }
        }

        return minLength;

    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{2,4,6,10,2,1};
        int[] nums2 = new int[]{5,8,50,4};
        int target1 =12;
        int target2 =50;
        System.out.println(lengthOfshortestSubArrayWithSumEqualtoTarget(nums2,target2));
    }
}
