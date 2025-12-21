package com.example.data_structure.referrence_area;

public class Demo18_SmallestMissingNumber {
    public static int getSmallestMissingNumber(int nums[]){
        for(int i=1;i<nums.length-1;i++){
            int diff = nums[i]-nums[i-1];
            if(diff>1){
                 return nums[i-1]+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
//        int[] nums = new int[]{0,1,3,4};
        int[] nums = new int[]{1,2,3,4};
        System.out.println(getSmallestMissingNumber(nums));
    }
}
