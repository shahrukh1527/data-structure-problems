package com.example.data_structure.referrence_area;

public class Demo11_Minimum_in_rotated_sorted_array {
    public static int findMin(int[] nums){
        int left =0;
        int right = nums.length-1;

        while (left<right){
            int mid = left+(right-left)/2;

            if(nums[mid]>nums[right]){
                left =mid+1;
            } else{
                right = mid;
            }
        }
        return nums[left];
    }
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,-1,0,1,2};
        System.out.println(findMin(nums));
    }
}
